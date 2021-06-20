public class Reception {
    Filter f;

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public void recept(User u) {
        if (u.getType() != null)//为什么要加上这一步，v1和v2才能被赋值进去？
            return;
        if (f != null) {//因为其他用户Type都被赋值"A"，所以其他是f==null，其他的Id都被设定了，只有Type是有null的，但是为什么不是u.getType!=null?
            f.filterUser(u);//而是f!=null
            return;
        } else {
            u.setType("A");
        }
    }

}

