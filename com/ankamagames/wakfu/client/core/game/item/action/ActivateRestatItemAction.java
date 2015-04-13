package com.ankamagames.wakfu.client.core.game.item.action;

import org.apache.log4j.*;
import com.ankamagames.wakfu.common.game.item.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.wakfu.client.ui.*;
import com.ankamagames.xulor2.core.messagebox.*;
import com.ankamagames.wakfu.client.core.*;
import com.ankamagames.wakfu.client.core.game.characterInfo.*;
import com.ankamagames.wakfu.common.game.item.action.*;

final class ActivateRestatItemAction extends AbstractClientItemAction
{
    private static final Logger m_logger;
    
    ActivateRestatItemAction(final int id) {
        super(id);
    }
    
    @Override
    public void parseParameters(final String[] params) {
    }
    
    @Override
    public boolean run(final Item item) {
        final MessageBoxControler msgBox = Xulor.getInstance().msgBox(WakfuTranslator.getInstance().getString("question.activate.restat"), WakfuMessageBoxConstants.getMessageBoxIconUrl(0), 2073L, 102, 1);
        msgBox.addEventListener(new MessageBoxEventListener() {
            @Override
            public void messageBoxClosed(final int type, final String userEntry) {
                if (type == 8) {
                    ActivateRestatItemAction.this.sendRequest(item);
                }
            }
        });
        return true;
    }
    
    private void sendRequest(final Item item) {
        final LocalPlayerCharacter character = WakfuGameEntity.getInstance().getLocalPlayer();
        if (character.getBags().getItemFromInventories(item.getUniqueId()) == null) {
            ActivateRestatItemAction.m_logger.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return;
        }
        this.sendRequest(item.getUniqueId());
    }
    
    @Override
    public void clear() {
    }
    
    @Override
    public ItemActionConstants getType() {
        return ItemActionConstants.ACTIVATE_RESTAT;
    }
    
    static {
        m_logger = Logger.getLogger((Class)ActivateRestatItemAction.class);
    }
}
