package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class ContainerCharacterCreationDecoratorLeftRevert implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ContainerCharacterCreationDecoratorLeftRevert() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final PixmapBackground checkOut = PixmapBackground.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setScaled(true);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setFlipHorizontaly(true);
        checkOut2.setFlipVerticaly(true);
        checkOut2.setHeight(51);
        checkOut2.setPosition(Alignment17.NORTH_EAST);
        checkOut2.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut2.setWidth(111);
        checkOut2.setX(876);
        checkOut2.setY(177);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setFlipVerticaly(true);
        checkOut3.setHeight(51);
        checkOut3.setPosition(Alignment17.NORTH);
        checkOut3.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut3.setWidth(1);
        checkOut3.setX(1008);
        checkOut3.setY(971);
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setFlipHorizontaly(true);
        checkOut4.setFlipVerticaly(true);
        checkOut4.setHeight(51);
        checkOut4.setPosition(Alignment17.NORTH_WEST);
        checkOut4.setTexture(this.doc.getTexture("preWorld_1.tga"));
        checkOut4.setWidth(238);
        checkOut4.setX(2);
        checkOut4.setY(11);
        checkOut.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(0);
        checkOut5.setPosition(Alignment17.WEST);
        checkOut5.setWidth(238);
        checkOut5.setX(1585);
        checkOut5.setY(5);
        checkOut.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(0);
        checkOut6.setPosition(Alignment17.CENTER);
        checkOut6.setWidth(1);
        checkOut6.setX(1585);
        checkOut6.setY(5);
        checkOut.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(0);
        checkOut7.setPosition(Alignment17.EAST);
        checkOut7.setWidth(111);
        checkOut7.setX(1585);
        checkOut7.setY(5);
        checkOut.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(0);
        checkOut8.setPosition(Alignment17.SOUTH_WEST);
        checkOut8.setWidth(238);
        checkOut8.setX(1585);
        checkOut8.setY(5);
        checkOut.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(0);
        checkOut9.setPosition(Alignment17.SOUTH);
        checkOut9.setWidth(1);
        checkOut9.setX(1585);
        checkOut9.setY(5);
        checkOut.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(0);
        checkOut10.setPosition(Alignment17.SOUTH_EAST);
        checkOut10.setWidth(111);
        checkOut10.setX(1585);
        checkOut10.setY(5);
        checkOut.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
