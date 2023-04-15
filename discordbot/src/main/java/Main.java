import events.MessageEventListener;
import events.ReadyEventListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        final String TOKEN = System.getenv("SECOND_BOT_TOKEN");

        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);
        jdaBuilder
                .setActivity(Activity.playing("Test Activity"))
                .addEventListeners(new ReadyEventListener(), new MessageEventListener())
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .build();
    }
}
