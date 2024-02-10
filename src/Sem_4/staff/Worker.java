package Sem_4.staff;

public abstract class Worker {

    protected String name;

    protected String post;


    public Worker(String name, String post){
        this.name = name;
        this.post = post;
    }


    public Worker(String name){
        this.name = name;
        this.post = getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("Name: %s, post: %s", name, post);
    }
}
