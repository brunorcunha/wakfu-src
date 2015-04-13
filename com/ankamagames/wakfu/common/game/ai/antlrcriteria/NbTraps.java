package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import java.util.*;
import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.wakfu.common.game.effectArea.*;

public class NbTraps extends NbAreas
{
    public NbTraps(final ArrayList<ParserObject> args) {
        super(args);
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.GETTRAPAMOUNT;
    }
    
    @Override
    protected int getAreaType() {
        return EffectAreaType.TRAP.getTypeId();
    }
}
