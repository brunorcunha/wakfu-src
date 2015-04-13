package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import java.awt.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.appearance.*;

public class ArchipelagoValidationDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public ArchipelagoValidationDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setPrefSize(new Dimension(112, 50));
        checkOut.setStyle("popup");
        checkOut.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setResizeOnce(true);
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final DecoratorAppearance appearance = checkOut.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut2 = Margin.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setInsets(new Insets(0, 5, 0, 5));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        appearance.onChildrenAdded();
        final RowLayout checkOut3 = RowLayout.checkOut();
        checkOut3.setAlign(Alignment9.NORTH);
        checkOut3.setHorizontal(false);
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final Container checkOut4 = Container.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        final BorderLayout element2 = new BorderLayout();
        element2.onCheckOut();
        checkOut4.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final Label element3 = new Label();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setStyle("BigTitle");
        element3.setMinWidth(150);
        element3.setMaxWidth(150);
        checkOut4.addBasicElement(element3);
        element3.onAttributesInitialized();
        final PropertyElement checkOut5 = PropertyElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setAttribute("text");
        checkOut5.setName("selectedArchipelago");
        checkOut5.setField("name");
        element3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final DecoratorAppearance appearance2 = element3.getAppearance();
        appearance2.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance2).setAlignment(Alignment9.WEST);
        element3.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        appearance2.onChildrenAdded();
        final BorderLayoutData checkOut6 = BorderLayoutData.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setData(BorderLayoutData.Values.WEST);
        element3.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        element3.onChildrenAdded();
        final Container checkOut7 = Container.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut4.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final BorderLayoutData checkOut8 = BorderLayoutData.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setData(BorderLayoutData.Values.EAST);
        checkOut7.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final Button element4 = new Button();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setStyle("smallValid");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.archipelagoChoice:validArchipelagoSelection");
        element4.setOnClick(onClick);
        checkOut7.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final Button element5 = new Button();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setStyle("smallCancel");
        final MouseClickedListener onClick2 = new MouseClickedListener();
        onClick2.setCallBackFunc("wakfu.archipelagoChoice:cancelArchipelagoSelection");
        element5.setOnClick(onClick2);
        checkOut7.addBasicElement(element5);
        element5.onAttributesInitialized();
        final DecoratorAppearance appearance3 = element5.getAppearance();
        appearance3.setElementMap(elementMap);
        element5.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(0, 5, 0, 0));
        appearance3.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance3.onChildrenAdded();
        element5.onChildrenAdded();
        checkOut7.onChildrenAdded();
        checkOut4.onChildrenAdded();
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setExpandable(false);
        checkOut10.setStyle("lineSeparator");
        checkOut10.setPrefSize(new Dimension(0, 7));
        checkOut.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final DecoratorAppearance appearance4 = checkOut10.getAppearance();
        appearance4.setElementMap(elementMap);
        checkOut10.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut11 = Margin.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setInsets(new Insets(5, 0, 2, 0));
        appearance4.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        appearance4.onChildrenAdded();
        checkOut10.onChildrenAdded();
        final TextView element6 = new TextView();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setStyle("white");
        element6.setMinWidth(150);
        element6.setMaxWidth(150);
        checkOut.addBasicElement(element6);
        element6.onAttributesInitialized();
        final PropertyElement checkOut12 = PropertyElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setAttribute("text");
        checkOut12.setName("selectedArchipelago");
        checkOut12.setField("description");
        element6.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        final DecoratorAppearance appearance5 = element6.getAppearance();
        appearance5.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance5).setAlignment(Alignment9.CENTER);
        element6.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        appearance5.onChildrenAdded();
        element6.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}
