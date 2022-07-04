package training6;

public class UseUsers {
    public static void main (String[] args){

        SysUser sysUser = new SysUser();

        sysUser.setAge(35);
        sysUser.printAge();
        sysUser.getFromConsole();
        sysUser.setName();

        System.out.println(sysUser.getName() + " " + sysUser.getAge());



    }
}
