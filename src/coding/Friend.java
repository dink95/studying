package coding;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    static boolean result =false;
    public boolean canBeConnected(Friend friend) {
    HashSet<String> set = new HashSet<>();
    set.add(this.email);
    DFS(friend.email, set,this);
    return result;
}
    void DFS(String e, HashSet<String>set, Friend friend){
        if(result)
            return;
        if(e.equals(friend.email)){
            result=true;
            return;
        }
        for(Friend f : friend.getFriends()){
            if(!set.contains(f.email)){
                set.add(f.email);
                DFS(e,set,f);
            }
        }
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");
        Friend d = new Friend("D");
        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(d));
    }
}