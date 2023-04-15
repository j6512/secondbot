import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        final String TOKEN = "MTA5NjczNjE2OTU2NTM2ODQwMQ.G-DWvj.G3o3f3D9n0bA45iRHNhLch-EIksfzlL_V1MUvs";
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);
        jdaBuilder.setActivity(Activity.playing("Test Activity"));
        jdaBuilder.build();
    }
}
