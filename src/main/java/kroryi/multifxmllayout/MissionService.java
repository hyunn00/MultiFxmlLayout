package kroryi.multifxmllayout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MissionService {
    private final String txtPath = "txt/";

    public String getMissionInfo(String missionName) throws IOException {
        final StringBuilder fileContents = new StringBuilder(2000);
        final InputStream is = this.getClass().getResourceAsStream(txtPath + missionName);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is));) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContents.append(line).append('\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileContents.toString();
    }
}
