package builder.nBuilder;

/**
 * Director
 */
public class Director {
    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;    
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("From Morning to Afternoon");
        builder.makeItems(new String[]{
            "Good Morning!",
            "Good Afternoon!"
        });
        builder.makeString("Night");
        builder.makeItems(new String[]{
            "Good Night!",
            "Good Dream!",
            "Good Bye!"
        });
        builder.close();
    }

    
}