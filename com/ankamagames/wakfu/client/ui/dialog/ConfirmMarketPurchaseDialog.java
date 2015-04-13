package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.appearance.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.renderer.condition.*;

public class ConfirmMarketPurchaseDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public ConfirmMarketPurchaseDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final String id = "confirmPurchaseWindow";
        final Window element = new Window();
        element.onCheckOut();
        element.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, element);
        }
        element.setPack(true);
        element.onAttributesInitialized();
        final StaticLayout element2 = new StaticLayout();
        element2.onCheckOut();
        element2.setAdaptToContentSize(true);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element3 = new StaticLayoutData();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        checkOut.onChildrenAdded();
        final Container checkOut2 = Container.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setStyle("windowNew");
        element.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut2.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut2.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element4 = new Padding();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setInsets(new Insets(10, 5, 12, 5));
        appearance.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        appearance.onChildrenAdded();
        final StaticLayoutData element5 = new StaticLayoutData();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setSize(new Dimension(100.0f, 100.0f));
        checkOut2.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        final RowLayout checkOut3 = RowLayout.checkOut();
        checkOut3.setHorizontal(false);
        checkOut3.setAlign(Alignment9.NORTH);
        checkOut2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final WindowMovePoint element6 = new WindowMovePoint();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setExpandable(false);
        checkOut2.addBasicElement(element6);
        element6.onAttributesInitialized();
        final DecoratorAppearance appearance2 = element6.getAppearance();
        appearance2.setElementMap(elementMap);
        element6.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(0, 10, 0, 10));
        appearance2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance2.onChildrenAdded();
        final Container checkOut5 = Container.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setStyle("titleBar");
        element6.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final DecoratorAppearance appearance3 = checkOut5.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut5.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Padding element7 = new Padding();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setInsets(new Insets(3, 20, 3, 20));
        appearance3.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        appearance3.onChildrenAdded();
        final RowLayout checkOut6 = RowLayout.checkOut();
        checkOut6.setHorizontal(false);
        checkOut5.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final Container checkOut7 = Container.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setExpandable(false);
        checkOut5.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final RowLayoutData element8 = new RowLayoutData();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setAlign(Alignment9.CENTER);
        checkOut7.addBasicElement(element8);
        element8.onAttributesInitialized();
        element8.onChildrenAdded();
        final TextView element9 = new TextView();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setStyle("StyledBold16White");
        element9.setNonBlocking(true);
        element9.setMinWidth(250);
        checkOut7.addBasicElement(element9);
        element9.onAttributesInitialized();
        final PropertyElement checkOut8 = PropertyElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setName("marketItemPurchase");
        checkOut8.setAttribute("text");
        checkOut8.setField("name");
        element9.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final DecoratorAppearance appearance4 = element9.getAppearance();
        appearance4.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance4).setAlign(Alignment9.CENTER);
        element9.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(0, 0, 0, 0));
        appearance4.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance4.onChildrenAdded();
        element9.onChildrenAdded();
        checkOut7.onChildrenAdded();
        checkOut5.onChildrenAdded();
        element6.onChildrenAdded();
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut2.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final DecoratorAppearance appearance5 = checkOut10.getAppearance();
        appearance5.setElementMap(elementMap);
        checkOut10.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Margin checkOut11 = Margin.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setInsets(new Insets(0, 12, 0, 12));
        appearance5.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        appearance5.onChildrenAdded();
        final String id2 = "windowContentContainer";
        final Container checkOut12 = Container.checkOut();
        checkOut12.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, checkOut12);
        }
        checkOut10.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        final Container checkOut13 = Container.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut12.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        final RowLayout checkOut14 = RowLayout.checkOut();
        checkOut14.setHorizontal(true);
        checkOut13.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final Container checkOut15 = Container.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut13.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        final RowLayout checkOut16 = RowLayout.checkOut();
        checkOut16.setHorizontal(true);
        checkOut15.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final Container checkOut17 = Container.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setStyle("flat");
        checkOut17.setPrefSize(new Dimension(0, 35));
        checkOut15.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        final RowLayoutData element10 = new RowLayoutData();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setAlign(Alignment9.CENTER);
        checkOut17.addBasicElement(element10);
        element10.onAttributesInitialized();
        element10.onChildrenAdded();
        final RowLayout checkOut18 = RowLayout.checkOut();
        checkOut18.setHorizontal(false);
        checkOut17.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        final Label element11 = new Label();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setText("%quantity%%colon%".replace("%quantity%", Xulor.getInstance().getTranslatedString("quantity")).replace("%colon%", Xulor.getInstance().getTranslatedString("colon")));
        element11.setStyle("bold");
        checkOut17.addBasicElement(element11);
        element11.onAttributesInitialized();
        final DecoratorAppearance appearance6 = element11.getAppearance();
        appearance6.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance6).setAlign(Alignment9.CENTER);
        element11.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        appearance6.onChildrenAdded();
        element11.onChildrenAdded();
        final Container checkOut19 = Container.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setStyle("ShortcutRowBackgroundFull");
        checkOut19.setPrefSize(new Dimension(150, 0));
        checkOut17.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        final DecoratorAppearance appearance7 = checkOut19.getAppearance();
        appearance7.setElementMap(elementMap);
        checkOut19.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final Padding element12 = new Padding();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setInsets(new Insets(2, 5, 2, 5));
        appearance7.addBasicElement(element12);
        element12.onAttributesInitialized();
        element12.onChildrenAdded();
        appearance7.onChildrenAdded();
        final Button element13 = new Button();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setStyle("yellowLeftArrow");
        element13.setExpandable(false);
        final MousePressedListener onMousePress = new MousePressedListener();
        onMousePress.setCallBackFunc("wakfu.market:decreaseQuantity");
        element13.setOnMousePress(onMousePress);
        checkOut19.addBasicElement(element13);
        element13.onAttributesInitialized();
        final DecoratorAppearance appearance8 = element13.getAppearance();
        appearance8.setElementMap(elementMap);
        element13.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final Margin checkOut20 = Margin.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setInsets(new Insets(0, 0, 0, 1));
        appearance8.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        checkOut20.onChildrenAdded();
        appearance8.onChildrenAdded();
        element13.onChildrenAdded();
        final String id3 = "qtyTextEditor";
        final TextEditor textEditor = new TextEditor();
        textEditor.onCheckOut();
        textEditor.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, textEditor);
        }
        textEditor.setStyle("dark");
        textEditor.setPrefSize(new Dimension(30, 0));
        textEditor.setMaxChars(3);
        textEditor.setRestrict("[0-9]+");
        textEditor.setFocused(true);
        textEditor.setExpandable(false);
        final KeyTypedListener onKeyType = new KeyTypedListener();
        onKeyType.setCallBackFunc("wakfu.market:validQuantity(qtyTextEditor)");
        textEditor.setOnKeyType(onKeyType);
        checkOut19.addBasicElement(textEditor);
        textEditor.onAttributesInitialized();
        final DecoratorAppearance appearance9 = textEditor.getAppearance();
        appearance9.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance9).setAlign(Alignment9.EAST);
        textEditor.addBasicElement(appearance9);
        appearance9.onAttributesInitialized();
        final Margin checkOut21 = Margin.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setInsets(new Insets(0, 0, 0, 0));
        appearance9.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        appearance9.onChildrenAdded();
        textEditor.onChildrenAdded();
        final Button element14 = new Button();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element14.setStyle("yellowRightArrow");
        element14.setExpandable(false);
        final MousePressedListener onMousePress2 = new MousePressedListener();
        onMousePress2.setCallBackFunc("wakfu.market:increaseQuantity");
        element14.setOnMousePress(onMousePress2);
        checkOut19.addBasicElement(element14);
        element14.onAttributesInitialized();
        final DecoratorAppearance appearance10 = element14.getAppearance();
        appearance10.setElementMap(elementMap);
        element14.addBasicElement(appearance10);
        appearance10.onAttributesInitialized();
        final Margin checkOut22 = Margin.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setInsets(new Insets(0, 1, 0, 2));
        appearance10.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        appearance10.onChildrenAdded();
        element14.onChildrenAdded();
        final Container checkOut23 = Container.checkOut();
        checkOut23.setElementMap(elementMap);
        checkOut23.setStyle("backgroundPopupLight");
        checkOut23.setExpandable(false);
        checkOut19.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        final DecoratorAppearance appearance11 = checkOut23.getAppearance();
        appearance11.setElementMap(elementMap);
        checkOut23.addBasicElement(appearance11);
        appearance11.onAttributesInitialized();
        final Padding element15 = new Padding();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setInsets(new Insets(0, 5, 0, 5));
        appearance11.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        appearance11.onChildrenAdded();
        final Label element16 = new Label();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setExpandable(false);
        element16.setStyle("whitebold");
        checkOut23.addBasicElement(element16);
        element16.onAttributesInitialized();
        final PropertyElement checkOut24 = PropertyElement.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setAttribute("text");
        checkOut24.setName("currentItemStackQtyPlusTotal");
        element16.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        checkOut24.onChildrenAdded();
        element16.onChildrenAdded();
        checkOut23.onChildrenAdded();
        checkOut19.onChildrenAdded();
        checkOut17.onChildrenAdded();
        final Container checkOut25 = Container.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setStyle("flat");
        checkOut25.setPrefSize(new Dimension(0, 35));
        checkOut15.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        final RowLayoutData element17 = new RowLayoutData();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element17.setAlign(Alignment9.CENTER);
        checkOut25.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        final RowLayout checkOut26 = RowLayout.checkOut();
        checkOut26.setHorizontal(false);
        checkOut25.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        checkOut26.onChildrenAdded();
        final Label element18 = new Label();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setText("%totalPrice%".replace("%totalPrice%", Xulor.getInstance().getTranslatedString("totalPrice")));
        element18.setStyle("bold");
        checkOut25.addBasicElement(element18);
        element18.onAttributesInitialized();
        final DecoratorAppearance appearance12 = element18.getAppearance();
        appearance12.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance12).setAlign(Alignment9.CENTER);
        element18.addBasicElement(appearance12);
        appearance12.onAttributesInitialized();
        appearance12.onChildrenAdded();
        element18.onChildrenAdded();
        final Container checkOut27 = Container.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setStyle("ShortcutRowBackgroundFull");
        checkOut27.setPrefSize(new Dimension(100, 0));
        checkOut25.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        final DecoratorAppearance appearance13 = checkOut27.getAppearance();
        appearance13.setElementMap(elementMap);
        checkOut27.addBasicElement(appearance13);
        appearance13.onAttributesInitialized();
        final Padding element19 = new Padding();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setInsets(new Insets(2, 5, 2, 5));
        appearance13.addBasicElement(element19);
        element19.onAttributesInitialized();
        element19.onChildrenAdded();
        appearance13.onChildrenAdded();
        final Label element20 = new Label();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setStyle("bold");
        checkOut27.addBasicElement(element20);
        element20.onAttributesInitialized();
        final DecoratorAppearance appearance14 = element20.getAppearance();
        appearance14.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance14).setAlign(Alignment9.EAST);
        element20.addBasicElement(appearance14);
        appearance14.onAttributesInitialized();
        final Margin checkOut28 = Margin.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setInsets(new Insets(0, 0, 0, 3));
        appearance14.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        final PropertyElement checkOut29 = PropertyElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setAttribute("textColor");
        checkOut29.setName("currentItemTotalPrice");
        appearance14.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        final ConditionResult element21 = new ConditionResult();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element21.setValue("1,0,0");
        element21.setElseValue("0,0,0");
        checkOut29.addBasicElement(element21);
        element21.onAttributesInitialized();
        final GreaterCondition element22 = new GreaterCondition();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element21.addBasicElement(element22);
        element22.onAttributesInitialized();
        final PropertyElement checkOut30 = PropertyElement.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setAttribute("value");
        checkOut30.setName("kamas");
        element22.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        element22.onChildrenAdded();
        element21.onChildrenAdded();
        checkOut29.onChildrenAdded();
        appearance14.onChildrenAdded();
        final PropertyElement checkOut31 = PropertyElement.checkOut();
        checkOut31.setElementMap(elementMap);
        checkOut31.setAttribute("text");
        checkOut31.setName("currentItemTotalPrice");
        element20.addBasicElement(checkOut31);
        checkOut31.onAttributesInitialized();
        checkOut31.onChildrenAdded();
        element20.onChildrenAdded();
        final Image element23 = new Image();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element23.setStyle("kamas");
        element23.setExpandable(false);
        checkOut27.addBasicElement(element23);
        element23.onAttributesInitialized();
        element23.onChildrenAdded();
        checkOut27.onChildrenAdded();
        checkOut25.onChildrenAdded();
        checkOut15.onChildrenAdded();
        final Container checkOut32 = Container.checkOut();
        checkOut32.setElementMap(elementMap);
        checkOut13.addBasicElement(checkOut32);
        checkOut32.onAttributesInitialized();
        final RowLayout checkOut33 = RowLayout.checkOut();
        checkOut33.setAlign(Alignment9.EAST);
        checkOut32.addBasicElement(checkOut33);
        checkOut33.onAttributesInitialized();
        checkOut33.onChildrenAdded();
        final Container checkOut34 = Container.checkOut();
        checkOut34.setElementMap(elementMap);
        checkOut34.setExpandable(false);
        checkOut32.addBasicElement(checkOut34);
        checkOut34.onAttributesInitialized();
        final StaticLayout element24 = new StaticLayout();
        element24.onCheckOut();
        element24.setAdaptToContentSize(true);
        checkOut34.addBasicElement(element24);
        element24.onAttributesInitialized();
        element24.onChildrenAdded();
        final Button element25 = new Button();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element25.setStyle("yellow");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("unloadDialog");
        element25.setOnClick(onClick);
        checkOut34.addBasicElement(element25);
        element25.onAttributesInitialized();
        this.method0(element25);
        this.method1(element25);
        element25.onChildrenAdded();
        this.method2(checkOut34);
        checkOut34.onChildrenAdded();
        this.method3(checkOut32);
        checkOut32.onChildrenAdded();
        checkOut13.onChildrenAdded();
        checkOut12.onChildrenAdded();
        checkOut10.onChildrenAdded();
        checkOut2.onChildrenAdded();
        this.method4(element);
        this.method5(element);
        this.method6(element);
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAlign(Alignment17.CENTER);
        element.setSize(new Dimension(100.0f, 100.0f));
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = ((Widget)basicElement).getAppearance();
        appearance.setElementMap(elementMap);
        basicElement.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element = new Padding();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setInsets(new Insets(7, 7, 7, 7));
        appearance.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        appearance.onChildrenAdded();
        return appearance;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Image element = new Image();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("cancel");
        element.setNonBlocking(true);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setAlign(Alignment17.CENTER);
        element2.setSize(new Dimension(100.0f, 100.0f));
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method3(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setExpandable(false);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayout element = new StaticLayout();
        element.onCheckOut();
        element.setAdaptToContentSize(true);
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final String id = "confirmButton";
        final Button button = new Button();
        button.onCheckOut();
        button.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, button);
        }
        button.setStyle("yellow");
        button.setExpandable(false);
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.market:confirmPurchase");
        button.setOnClick(onClick);
        checkOut.addBasicElement(button);
        button.onAttributesInitialized();
        final PropertyElement checkOut2 = PropertyElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setAttribute("enabled");
        checkOut2.setName("currentItemTotalPrice");
        button.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final ConditionResult element2 = new ConditionResult();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        checkOut2.addBasicElement(element2);
        element2.onAttributesInitialized();
        final NotCondition element3 = new NotCondition();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        final GreaterCondition element4 = new GreaterCondition();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element3.addBasicElement(element4);
        element4.onAttributesInitialized();
        final PropertyElement checkOut3 = PropertyElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setAttribute("value");
        checkOut3.setName("kamas");
        element4.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        element4.onChildrenAdded();
        element3.onChildrenAdded();
        element2.onChildrenAdded();
        checkOut2.onChildrenAdded();
        final StaticLayoutData element5 = new StaticLayoutData();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setAlign(Alignment17.CENTER);
        element5.setSize(new Dimension(100.0f, 100.0f));
        button.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        final DecoratorAppearance appearance = button.getAppearance();
        appearance.setElementMap(elementMap);
        button.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element6 = new Padding();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setInsets(new Insets(7, 7, 7, 7));
        appearance.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        appearance.onChildrenAdded();
        button.onChildrenAdded();
        final Image element7 = new Image();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setStyle("apply");
        element7.setNonBlocking(true);
        checkOut.addBasicElement(element7);
        element7.onAttributesInitialized();
        final StaticLayoutData element8 = new StaticLayoutData();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setAlign(Alignment17.CENTER);
        element8.setSize(new Dimension(100.0f, 100.0f));
        element7.addBasicElement(element8);
        element8.onAttributesInitialized();
        element8.onChildrenAdded();
        element7.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method4(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method5(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Button element = new Button();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("close");
        element.setExpandable(false);
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("unloadDialog");
        element.setOnClick(onClick);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setSize(new Dimension(-2, -2));
        element2.setAlign(Alignment17.NORTH_EAST);
        element2.setXOffset(-18);
        element2.setYOffset(-12);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method6(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setResizeOnce(true);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
}
