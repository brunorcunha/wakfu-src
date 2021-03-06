package com.ankamagames.wakfu.client.console.command.commonIn;

import com.ankamagames.baseImpl.client.proxyclient.base.console.command.*;
import com.ankamagames.baseImpl.client.proxyclient.base.console.*;
import com.ankamagames.baseImpl.client.proxyclient.base.console.command.descriptors.*;
import java.util.*;
import com.ankamagames.wakfu.client.ui.protocol.frame.*;

public class AdditionalShortcutBarCommand implements Command
{
    @Override
    public void execute(final ConsoleManager manager, final CommandPattern pattern, final ArrayList<String> args) {
        final byte index = Byte.parseByte(args.get(2));
        UIShortcutBarFrame.getInstance().openCloseAdditionalShortcutBar(index);
    }
    
    @Override
    public boolean isPassThrough() {
        return false;
    }
}
