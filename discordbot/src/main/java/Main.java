import events.MessageEventListener;
import events.ReadyEventListener;
import events.SlashCommandInteractionEventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        final String TOKEN = System.getenv("SECOND_BOT_TOKEN");

        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);
        JDA jda = jdaBuilder
                .setActivity(Activity.playing("Test Activity"))
                .addEventListeners(
                        new ReadyEventListener(),
                        new MessageEventListener(),
                        new SlashCommandInteractionEventListener())
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .build();

        jda.upsertCommand("slash-cmd", "This is a slash command").setGuildOnly(true).queue();
        jda.upsertCommand("flash-cards", "Lists all flash cards").setGuildOnly(true).queue();
        jda.upsertCommand("quiz", "Gives you a random quizzzz").setGuildOnly(false).queue();
    }
}
