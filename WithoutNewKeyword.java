public class WithoutNewKeyword{

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException,IllegalAccessException,CloneNotSupportedException
    {
        // Using newInstance Method present in Class.java
        Class c = Class.forName("WithoutNewKeyword");
        WithoutNewKeyword wnk = (WithoutNewKeyword)c.newInstance();
        wnk.methodCheck();
        //coping the first object to second one
        WithoutNewKeyword wnk1 = wnk;
        //Making clone from other object
        WithoutNewKeyword wnk2 = (WithoutNewKeyword) wnk1.clone();
        //Using ClassLoader method
        WithoutNewKeyword wnk3 = (WithoutNewKeyword) wnk2.getClass().getClassLoader().loadClass("WithoutNewKeyword").newInstance();
    }
    public void methodCheck()
    {
        System.out.println("We have created object without new keyword");
    }

}
