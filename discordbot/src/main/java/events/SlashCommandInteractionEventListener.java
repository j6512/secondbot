package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class SlashCommandInteractionEventListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);

        switch (event.getName()) {
            case "flash-cards":
                event.reply("Here are your flash cards").setEphemeral(true).queue();
                break;
            case "quiz":
                event.reply("Here is your quiz").setEphemeral(true).queue();
                break;
            default:
                event.reply("Invalid command").setEphemeral(true).queue();
                break;
        }
    }
}
