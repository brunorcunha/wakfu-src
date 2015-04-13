package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.core.renderer.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.appearance.*;
import com.ankamagames.xulor2.util.alignment.*;

public class CalendarDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public CalendarDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Window window = new Window();
        window.onCheckOut();
        window.setElementMap(elementMap);
        window.onAttributesInitialized();
        final StaticLayout element = new StaticLayout();
        element.onCheckOut();
        element.setAdaptToContentSize(true);
        window.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        window.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        checkOut.onChildrenAdded();
        final Container checkOut2 = Container.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setStyle("windowNew");
        window.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut2.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut2.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element3 = new Padding();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setInsets(new Insets(10, 5, 12, 5));
        appearance.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        appearance.onChildrenAdded();
        final StaticLayoutData element4 = new StaticLayoutData();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setSize(new Dimension(100.0f, 100.0f));
        checkOut2.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final RowLayout checkOut3 = RowLayout.checkOut();
        checkOut3.setHorizontal(false);
        checkOut3.setAlign(Alignment9.NORTH);
        checkOut2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final WindowMovePoint element5 = new WindowMovePoint();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setExpandable(false);
        checkOut2.addBasicElement(element5);
        element5.onAttributesInitialized();
        final DecoratorAppearance appearance2 = element5.getAppearance();
        appearance2.setElementMap(elementMap);
        element5.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(0, 10, 0, 10));
        appearance2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance2.onChildrenAdded();
        element5.onChildrenAdded();
        final Container checkOut5 = Container.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut2.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final DecoratorAppearance appearance3 = checkOut5.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut5.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut6 = Margin.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setInsets(new Insets(0, 12, 0, 12));
        appearance3.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        appearance3.onChildrenAdded();
        final String id = "windowContentContainer";
        final Container checkOut7 = Container.checkOut();
        checkOut7.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut7);
        }
        checkOut5.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final RowLayoutData element6 = new RowLayoutData();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setAlign(Alignment9.NORTH);
        checkOut7.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        final RowLayout checkOut8 = RowLayout.checkOut();
        checkOut8.setHorizontal(false);
        checkOut8.setVgap((short)3);
        checkOut7.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final Container checkOut9 = Container.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setExpandable(false);
        checkOut7.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        final DecoratorAppearance appearance4 = checkOut9.getAppearance();
        appearance4.setElementMap(elementMap);
        checkOut9.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut10 = Margin.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setInsets(new Insets(0, 0, 0, 9));
        appearance4.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        appearance4.onChildrenAdded();
        final RowLayoutData element7 = new RowLayoutData();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setAlign(Alignment9.EAST);
        checkOut9.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        final String id2 = "hour";
        final ValueSelector valueSelector = new ValueSelector();
        valueSelector.onCheckOut();
        valueSelector.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, valueSelector);
        }
        valueSelector.setPrefSize(new Dimension(35, 0));
        valueSelector.setValue(12);
        valueSelector.setMinBound(0);
        valueSelector.setMaxBound(23);
        valueSelector.setExpandable(false);
        valueSelector.setDisplayFormat("%02d");
        checkOut9.addBasicElement(valueSelector);
        valueSelector.onAttributesInitialized();
        final PropertyElement checkOut11 = PropertyElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setAttribute("value");
        checkOut11.setName("calendar.editable");
        checkOut11.setField("hour");
        valueSelector.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        valueSelector.onChildrenAdded();
        final Label element8 = new Label();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setText("H");
        element8.setStyle("bold");
        element8.setExpandable(false);
        checkOut9.addBasicElement(element8);
        element8.onAttributesInitialized();
        final DecoratorAppearance appearance5 = element8.getAppearance();
        appearance5.setElementMap(elementMap);
        element8.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Margin checkOut12 = Margin.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setInsets(new Insets(0, 2, 0, 2));
        appearance5.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        appearance5.onChildrenAdded();
        element8.onChildrenAdded();
        final String id3 = "minutes";
        final ValueSelector valueSelector2 = new ValueSelector();
        valueSelector2.onCheckOut();
        valueSelector2.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, valueSelector2);
        }
        valueSelector2.setPrefSize(new Dimension(35, 0));
        valueSelector2.setValue(0);
        valueSelector2.setMinBound(0);
        valueSelector2.setMaxBound(59);
        valueSelector2.setExpandable(false);
        valueSelector2.setDisplayFormat("%02d");
        checkOut9.addBasicElement(valueSelector2);
        valueSelector2.onAttributesInitialized();
        final PropertyElement checkOut13 = PropertyElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setAttribute("value");
        checkOut13.setName("calendar.editable");
        checkOut13.setField("minute");
        valueSelector2.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        valueSelector2.onChildrenAdded();
        checkOut9.onChildrenAdded();
        final Container checkOut14 = Container.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setExpandable(false);
        checkOut7.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        final RowLayoutData element9 = new RowLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setAlign(Alignment9.EAST);
        checkOut14.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        final ComboBox element10 = new ComboBox();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setExpandable(false);
        element10.setPrefSize(new Dimension(100, 15));
        final ListSelectionChangedListener onListSelectionChange = new ListSelectionChangedListener();
        onListSelectionChange.setCallBackFunc("wakfu.eventsCalendar:changeEditableCurrentMonth");
        element10.setOnListSelectionChange(onListSelectionChange);
        checkOut14.addBasicElement(element10);
        element10.onAttributesInitialized();
        final PropertyElement checkOut15 = PropertyElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setAttribute("content");
        checkOut15.setName("calendar.editable");
        checkOut15.setField("monthesList");
        element10.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final PropertyElement checkOut16 = PropertyElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setAttribute("selectedValue");
        checkOut16.setName("calendar.editable");
        checkOut16.setField("selectedMonth");
        element10.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final RenderableContainer element11 = new RenderableContainer();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element10.addBasicElement(element11);
        element11.onAttributesInitialized();
        final ItemRenderer element12 = new ItemRenderer();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element11.addBasicElement(element12);
        element12.onAttributesInitialized();
        final Label element13 = new Label();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setNonBlocking(true);
        element12.addBasicElement(element13);
        element13.onAttributesInitialized();
        final RowLayoutData element14 = new RowLayoutData();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element14.setAlign(Alignment9.CENTER);
        element13.addBasicElement(element14);
        element14.onAttributesInitialized();
        element14.onChildrenAdded();
        final ItemElement element15 = new ItemElement();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setAttribute("text");
        element15.setField("description");
        element13.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        element13.onChildrenAdded();
        element12.onChildrenAdded();
        element11.onChildrenAdded();
        final List element16 = new List();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setHorizontal(false);
        element16.setCellSize(new Dimension(100.0f, 16));
        element10.addBasicElement(element16);
        element16.onAttributesInitialized();
        final ItemRenderer element17 = new ItemRenderer();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element16.addBasicElement(element17);
        element17.onAttributesInitialized();
        final Label element18 = new Label();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setNonBlocking(true);
        element17.addBasicElement(element18);
        element18.onAttributesInitialized();
        final ItemElement element19 = new ItemElement();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setAttribute("text");
        element19.setField("description");
        element18.addBasicElement(element19);
        element19.onAttributesInitialized();
        element19.onChildrenAdded();
        final DecoratorAppearance appearance6 = element18.getAppearance();
        appearance6.setElementMap(elementMap);
        element18.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final Margin checkOut17 = Margin.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setInsets(new Insets(0, 10, 0, 0));
        appearance6.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        appearance6.onChildrenAdded();
        element18.onChildrenAdded();
        element17.onChildrenAdded();
        element16.onChildrenAdded();
        element10.onChildrenAdded();
        final ComboBox element20 = new ComboBox();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setExpandable(false);
        element20.setPrefSize(new Dimension(50, 15));
        final ListSelectionChangedListener onListSelectionChange2 = new ListSelectionChangedListener();
        onListSelectionChange2.setCallBackFunc("wakfu.eventsCalendar:changeEditableCurrentYear");
        element20.setOnListSelectionChange(onListSelectionChange2);
        checkOut14.addBasicElement(element20);
        element20.onAttributesInitialized();
        final PropertyElement checkOut18 = PropertyElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setAttribute("content");
        checkOut18.setName("calendar.editable");
        checkOut18.setField("yearsList");
        element20.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        final PropertyElement checkOut19 = PropertyElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setAttribute("selectedValue");
        checkOut19.setName("calendar.editable");
        checkOut19.setField("selectedYear");
        element20.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        final RenderableContainer element21 = new RenderableContainer();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element20.addBasicElement(element21);
        element21.onAttributesInitialized();
        final ItemRenderer element22 = new ItemRenderer();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element21.addBasicElement(element22);
        element22.onAttributesInitialized();
        final Label element23 = new Label();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element23.setNonBlocking(true);
        element22.addBasicElement(element23);
        element23.onAttributesInitialized();
        final RowLayoutData element24 = new RowLayoutData();
        element24.onCheckOut();
        element24.setElementMap(elementMap);
        element24.setAlign(Alignment9.CENTER);
        element23.addBasicElement(element24);
        element24.onAttributesInitialized();
        element24.onChildrenAdded();
        final ItemElement element25 = new ItemElement();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element25.setAttribute("text");
        element23.addBasicElement(element25);
        element25.onAttributesInitialized();
        element25.onChildrenAdded();
        element23.onChildrenAdded();
        element22.onChildrenAdded();
        element21.onChildrenAdded();
        final List element26 = new List();
        element26.onCheckOut();
        element26.setElementMap(elementMap);
        element26.setHorizontal(false);
        element26.setCellSize(new Dimension(100.0f, 16));
        element20.addBasicElement(element26);
        element26.onAttributesInitialized();
        final ItemRenderer element27 = new ItemRenderer();
        element27.onCheckOut();
        element27.setElementMap(elementMap);
        element26.addBasicElement(element27);
        element27.onAttributesInitialized();
        final Label element28 = new Label();
        element28.onCheckOut();
        element28.setElementMap(elementMap);
        element28.setNonBlocking(true);
        element27.addBasicElement(element28);
        element28.onAttributesInitialized();
        final ItemElement element29 = new ItemElement();
        element29.onCheckOut();
        element29.setElementMap(elementMap);
        element29.setAttribute("text");
        element28.addBasicElement(element29);
        element29.onAttributesInitialized();
        element29.onChildrenAdded();
        final DecoratorAppearance appearance7 = element28.getAppearance();
        appearance7.setElementMap(elementMap);
        element28.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final Margin checkOut20 = Margin.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setInsets(new Insets(0, 10, 0, 0));
        appearance7.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        checkOut20.onChildrenAdded();
        appearance7.onChildrenAdded();
        element28.onChildrenAdded();
        element27.onChildrenAdded();
        element26.onChildrenAdded();
        element20.onChildrenAdded();
        checkOut14.onChildrenAdded();
        final String id4 = "calendar";
        final CalendarWidget calendarWidget = new CalendarWidget();
        calendarWidget.onCheckOut();
        calendarWidget.setElementMap(elementMap);
        if (elementMap != null && id4 != null) {
            elementMap.add(id4, calendarWidget);
        }
        calendarWidget.setStyle("small");
        calendarWidget.setExpandable(false);
        calendarWidget.setCellSize(new Dimension(22, 22));
        checkOut7.addBasicElement(calendarWidget);
        calendarWidget.onAttributesInitialized();
        final PropertyElement checkOut21 = PropertyElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setAttribute("calendar");
        checkOut21.setName("calendar.editable");
        checkOut21.setField("calendar");
        calendarWidget.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        final RowLayoutData element30 = new RowLayoutData();
        element30.onCheckOut();
        element30.setElementMap(elementMap);
        element30.setAlign(Alignment9.CENTER);
        calendarWidget.addBasicElement(element30);
        element30.onAttributesInitialized();
        element30.onChildrenAdded();
        final ItemRenderer element31 = new ItemRenderer();
        element31.onCheckOut();
        element31.setElementMap(elementMap);
        calendarWidget.addBasicElement(element31);
        element31.onAttributesInitialized();
        final Button element32 = new Button();
        element32.onCheckOut();
        element32.setElementMap(elementMap);
        element32.setStyle("flat");
        element31.addBasicElement(element32);
        element32.onAttributesInitialized();
        final RowLayout checkOut22 = RowLayout.checkOut();
        checkOut22.setAlign(Alignment9.WEST);
        element32.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        element32.onChildrenAdded();
        element31.onChildrenAdded();
        calendarWidget.onChildrenAdded();
        final Button element33 = new Button();
        element33.onCheckOut();
        element33.setElementMap(elementMap);
        element33.setClickSoundId(600002);
        element33.setStyle("flat");
        element33.setText("%ok%".replace("%ok%", Xulor.getInstance().getTranslatedString("ok")));
        element33.setExpandable(false);
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.eventsCalendar:selectDate(calendar,hour,minutes)");
        element33.setOnClick(onClick);
        checkOut7.addBasicElement(element33);
        element33.onAttributesInitialized();
        final DecoratorAppearance appearance8 = element33.getAppearance();
        appearance8.setElementMap(elementMap);
        element33.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final Padding element34 = new Padding();
        element34.onCheckOut();
        element34.setElementMap(elementMap);
        element34.setInsets(new Insets(3, 10, 3, 10));
        appearance8.addBasicElement(element34);
        element34.onAttributesInitialized();
        element34.onChildrenAdded();
        appearance8.onChildrenAdded();
        final RowLayoutData element35 = new RowLayoutData();
        element35.onCheckOut();
        element35.setElementMap(elementMap);
        element35.setAlign(Alignment9.CENTER);
        element33.addBasicElement(element35);
        element35.onAttributesInitialized();
        element35.onChildrenAdded();
        element33.onChildrenAdded();
        checkOut7.onChildrenAdded();
        checkOut5.onChildrenAdded();
        checkOut2.onChildrenAdded();
        this.method0(window);
        this.method1(window);
        this.method2(window);
        window.onChildrenAdded();
        return window;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
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
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Button element = new Button();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("close");
        element.setExpandable(false);
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.eventsCalendar:closeCalendar");
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
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setSize(new Dimension(-2, -2));
        element.setAlign(Alignment17.CENTER);
        element.setInitValue(true);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
}
