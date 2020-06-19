package Script;

import org.rspeer.script.ScriptMeta;
import org.rspeer.script.task.TaskScript;


@ScriptMeta(name = "Fisherman", desc = "fishes shit", developer = "empty")
public class FishingScript extends TaskScript {

    public static boolean PowerFishing = false;

    @Override
    public void onStart() {

    }
}
