package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class ContainerNotificationIconBackground implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ContainerNotificationIconBackground() {
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
        final String id = "notificationIconBorder";
        final PixmapBorder pixmapBorder = new PixmapBorder();
        pixmapBorder.onCheckOut();
        pixmapBorder.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, pixmapBorder);
        }
        appearance.addBasicElement(pixmapBorder);
        pixmapBorder.onAttributesInitialized();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setFlipVerticaly(true);
        checkOut.setHeight(4);
        checkOut.setPosition(Alignment17.SOUTH_WEST);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(11);
        checkOut.setX(221);
        checkOut.setY(549);
        pixmapBorder.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setFlipVerticaly(true);
        checkOut2.setHeight(4);
        checkOut2.setPosition(Alignment17.SOUTH);
        checkOut2.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut2.setWidth(1);
        checkOut2.setX(321);
        checkOut2.setY(292);
        pixmapBorder.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setFlipHorizontaly(true);
        checkOut3.setFlipVerticaly(true);
        checkOut3.setHeight(4);
        checkOut3.setPosition(Alignment17.SOUTH_EAST);
        checkOut3.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut3.setWidth(11);
        checkOut3.setX(221);
        checkOut3.setY(549);
        pixmapBorder.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setFlipHorizontaly(true);
        checkOut4.setFlipVerticaly(true);
        checkOut4.setHeight(1);
        checkOut4.setPosition(Alignment17.EAST);
        checkOut4.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut4.setWidth(11);
        checkOut4.setX(592);
        checkOut4.setY(180);
        pixmapBorder.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setFlipHorizontaly(true);
        checkOut5.setFlipVerticaly(true);
        checkOut5.setHeight(19);
        checkOut5.setPosition(Alignment17.NORTH_EAST);
        checkOut5.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut5.setWidth(11);
        checkOut5.setX(477);
        checkOut5.setY(222);
        pixmapBorder.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setFlipVerticaly(true);
        checkOut6.setHeight(19);
        checkOut6.setPosition(Alignment17.NORTH);
        checkOut6.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut6.setWidth(1);
        checkOut6.setX(694);
        checkOut6.setY(258);
        pixmapBorder.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setFlipVerticaly(true);
        checkOut7.setHeight(19);
        checkOut7.setPosition(Alignment17.NORTH_WEST);
        checkOut7.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut7.setWidth(11);
        checkOut7.setX(477);
        checkOut7.setY(222);
        pixmapBorder.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setFlipVerticaly(true);
        checkOut8.setHeight(1);
        checkOut8.setPosition(Alignment17.WEST);
        checkOut8.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut8.setWidth(11);
        checkOut8.setX(592);
        checkOut8.setY(180);
        pixmapBorder.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        pixmapBorder.onChildrenAdded();
        final String id2 = "notificationIconBackground";
        final PixmapBackground checkOut9 = PixmapBackground.checkOut();
        checkOut9.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, checkOut9);
        }
        checkOut9.setScaled(true);
        appearance.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setFlipVerticaly(true);
        checkOut10.setHeight(1);
        checkOut10.setPosition(Alignment17.CENTER);
        checkOut10.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut10.setWidth(1);
        checkOut10.setX(872);
        checkOut10.setY(177);
        checkOut9.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        checkOut9.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
