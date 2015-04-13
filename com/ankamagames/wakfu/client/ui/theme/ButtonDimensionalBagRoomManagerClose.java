package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class ButtonDimensionalBagRoomManagerClose implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ButtonDimensionalBagRoomManagerClose() {
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
        ((TextWidgetAppearance)appearance).setAlign(Alignment9.CENTER);
        appearance.setState("default");
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(28);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("dimensionalBag_0.tga"));
        checkOut.setWidth(37);
        checkOut.setX(211);
        checkOut.setY(117);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance2).setAlign(Alignment9.CENTER);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(28);
        checkOut2.setPosition(Alignment17.CENTER);
        checkOut2.setTexture(this.doc.getTexture("dimensionalBag_0.tga"));
        checkOut2.setWidth(37);
        checkOut2.setX(191);
        checkOut2.setY(195);
        appearance2.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance3).setAlign(Alignment9.CENTER);
        appearance3.setState("pressed");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(28);
        checkOut3.setPosition(Alignment17.CENTER);
        checkOut3.setTexture(this.doc.getTexture("dimensionalBag_0.tga"));
        checkOut3.setWidth(37);
        checkOut3.setX(191);
        checkOut3.setY(164);
        appearance3.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        appearance3.onChildrenAdded();
        final DecoratorAppearance appearance4 = widget.getAppearance();
        appearance4.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance4).setAlign(Alignment9.CENTER);
        appearance4.setState("disabled");
        widget.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(28);
        checkOut4.setPosition(Alignment17.CENTER);
        checkOut4.setTexture(this.doc.getTexture("dimensionalBag_0.tga"));
        checkOut4.setWidth(37);
        checkOut4.setX(191);
        checkOut4.setY(226);
        appearance4.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance4.onChildrenAdded();
    }
}
