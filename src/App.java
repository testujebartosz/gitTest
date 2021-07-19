public class App {

    public String name;
    public String version;

    public App(String name, String version){
        System.out.println("To jest program o nazwie " + name + " w wersji " + version + ".");
        this.name = name;
        this.version = version;
    }

    public void appInfo(){
        System.out.println("Aplikacja służy do mierzenie Twojego ciśnienia.");
    }

}
