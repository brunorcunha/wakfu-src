package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import java.awt.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class TabbedContainerDark$TabWest implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public TabbedContainerDark$TabWest() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Padding element = new Padding();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setInsets(new Insets(2, 2, 2, 2));
        widget.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlign(Alignment9.CENTER);
        appearance.setState("default");
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final FontElement checkOut = FontElement.checkOut();
        checkOut.setRenderer(Xulor.getInstance().getDocumentParser().getFont("defaultFont"));
        checkOut.setElementMap(elementMap);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final ColorElement checkOut2 = ColorElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PlainBackground element2 = new PlainBackground();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setColor(new Color(1.0f, 0.0f, 1.0f, 1.0f));
        appearance.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final PlainBorder element3 = new PlainBorder();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        element3.setInsets(new Insets(0, 0, 0, 1));
        appearance.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance2).setAlign(Alignment9.CENTER);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final ColorElement checkOut3 = ColorElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PlainBackground element4 = new PlainBackground();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setColor(new Color(1.0f, 1.0f, 0.0f, 1.0f));
        appearance2.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final PlainBorder element5 = new PlainBorder();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        element5.setInsets(new Insets(0, 0, 0, 1));
        appearance2.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance3).setAlign(Alignment9.CENTER);
        appearance3.setState("pressed");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final ColorElement checkOut4 = ColorElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance3.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PlainBackground element6 = new PlainBackground();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setColor(new Color(0.0f, 1.0f, 1.0f, 1.0f));
        appearance3.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        final PlainBorder element7 = new PlainBorder();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        element7.setInsets(new Insets(0, 0, 0, 1));
        appearance3.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        appearance3.onChildrenAdded();
        final DecoratorAppearance appearance4 = widget.getAppearance();
        appearance4.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance4).setAlign(Alignment9.CENTER);
        appearance4.setState("disabled");
        widget.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final ColorElement checkOut5 = ColorElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance4.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PlainBackground element8 = new PlainBackground();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setColor(new Color(0.5f, 0.5f, 0.5f, 1.0f));
        appearance4.addBasicElement(element8);
        element8.onAttributesInitialized();
        element8.onChildrenAdded();
        final PlainBorder element9 = new PlainBorder();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        element9.setInsets(new Insets(0, 0, 0, 1));
        appearance4.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        appearance4.onChildrenAdded();
        final DecoratorAppearance appearance5 = widget.getAppearance();
        appearance5.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance5).setAlign(Alignment9.CENTER);
        appearance5.setState("selected");
        widget.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final ColorElement checkOut6 = ColorElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance5.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PlainBackground element10 = new PlainBackground();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        appearance5.addBasicElement(element10);
        element10.onAttributesInitialized();
        element10.onChildrenAdded();
        final PlainBorder element11 = new PlainBorder();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        element11.setInsets(new Insets(0, 0, 0, 1));
        appearance5.addBasicElement(element11);
        element11.onAttributesInitialized();
        element11.onChildrenAdded();
        appearance5.onChildrenAdded();
        final DecoratorAppearance appearance6 = widget.getAppearance();
        appearance6.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance6).setAlign(Alignment9.CENTER);
        appearance6.setState("mouseHoverSelected");
        widget.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final ColorElement checkOut7 = ColorElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance6.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PlainBackground element12 = new PlainBackground();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        appearance6.addBasicElement(element12);
        element12.onAttributesInitialized();
        element12.onChildrenAdded();
        final PlainBorder element13 = new PlainBorder();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        element13.setInsets(new Insets(0, 0, 0, 1));
        appearance6.addBasicElement(element13);
        element13.onAttributesInitialized();
        element13.onChildrenAdded();
        appearance6.onChildrenAdded();
        final DecoratorAppearance appearance7 = widget.getAppearance();
        appearance7.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance7).setAlign(Alignment9.CENTER);
        appearance7.setState("pressedSelected");
        widget.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final ColorElement checkOut8 = ColorElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance7.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PlainBackground element14 = new PlainBackground();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element14.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        appearance7.addBasicElement(element14);
        element14.onAttributesInitialized();
        element14.onChildrenAdded();
        final PlainBorder element15 = new PlainBorder();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        element15.setInsets(new Insets(0, 0, 0, 1));
        appearance7.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        appearance7.onChildrenAdded();
        final DecoratorAppearance appearance8 = widget.getAppearance();
        appearance8.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance8).setAlign(Alignment9.CENTER);
        appearance8.setState("disabledSelected");
        widget.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final ColorElement checkOut9 = ColorElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance8.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PlainBackground element16 = new PlainBackground();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        appearance8.addBasicElement(element16);
        element16.onAttributesInitialized();
        element16.onChildrenAdded();
        final PlainBorder element17 = new PlainBorder();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element17.setColor(new Color(0.0f, 0.8f, 0.8f, 1.0f));
        element17.setInsets(new Insets(0, 0, 0, 1));
        appearance8.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        appearance8.onChildrenAdded();
    }
}
