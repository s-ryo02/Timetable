import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import okhttp3.EventListener;

public class Bot extends EventListener {

    public static void main(String[] args)
            throws Exception
    {
        JDA jda = JDABuilder.createDefault("ODc1NzA4ODAxNzU4Njc0OTU1.YRZdYA.iR3AISuAqOtX0Jkh9dSUmGQYp7c").addEventListeners(new TListener()).build();

    }
}