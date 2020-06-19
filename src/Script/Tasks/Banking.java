package Script.Tasks;

import Script.FishingScript;
import org.rspeer.runetek.api.component.Bank;
import org.rspeer.runetek.api.component.tab.Inventory;
import org.rspeer.script.task.Task;

public class Banking extends Task {

    @Override
    public boolean validate() {
        return Inventory.isFull() && !FishingScript.PowerFishing;
    }

    @Override
    public int execute() {
        if(!Bank.isOpen())
        {
            Bank.open();
            return 1000;
        }

        Bank.depositAll();
        return 800;
    }
}
