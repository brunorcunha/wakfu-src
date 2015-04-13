package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.core.renderer.condition.*;
import com.ankamagames.xulor2.appearance.*;
import com.ankamagames.xulor2.component.*;

public class ItemDetailPopupShortcut implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public ItemDetailPopupShortcut() {
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
        checkOut.setVisible(false);
        checkOut.onAttributesInitialized();
        final RowLayout checkOut2 = RowLayout.checkOut();
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PropertyElement checkOut3 = PropertyElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setName("itemPopupDetail");
        checkOut3.setAttribute("visible");
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final ConditionResult element = new ConditionResult();
        element.onCheckOut();
        element.setElementMap(elementMap);
        checkOut3.addBasicElement(element);
        element.onAttributesInitialized();
        final NotNullCondition element2 = new NotNullCondition();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        checkOut3.onChildrenAdded();
        final Container checkOut4 = Container.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setExpandable(false);
        checkOut4.setPrefSize(new Dimension(250, 0));
        checkOut.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut4.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut4.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element3 = new Padding();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setInsets(new Insets(6, 6, 6, 6));
        appearance.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        final PlainBackground element4 = new PlainBackground();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setColor(new Color(0.0f, 0.0f, 0.0f, 0.9f));
        appearance.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        appearance.onChildrenAdded();
        final RowLayout checkOut5 = RowLayout.checkOut();
        checkOut5.setAlign(Alignment9.NORTH);
        checkOut5.setHorizontal(false);
        checkOut4.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final Container checkOut6 = Container.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setExpandable(false);
        checkOut4.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        final RowLayout checkOut7 = RowLayout.checkOut();
        checkOut6.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final Container checkOut8 = Container.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut6.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        final RowLayout checkOut9 = RowLayout.checkOut();
        checkOut9.setHorizontal(false);
        checkOut9.setAlign(Alignment9.NORTH);
        checkOut8.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final Label element5 = new Label();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setStyle("bigTitle");
        element5.setExpandable(false);
        checkOut8.addBasicElement(element5);
        element5.onAttributesInitialized();
        final PropertyElement checkOut10 = PropertyElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setName("itemPopupDetail");
        checkOut10.setAttribute("text");
        checkOut10.setField("name");
        element5.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        element5.onChildrenAdded();
        final Container checkOut11 = Container.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setExpandable(false);
        checkOut8.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        final RowLayoutData element6 = new RowLayoutData();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setAlign(Alignment9.WEST);
        checkOut11.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        final TextView element7 = new TextView();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setStyle("white11");
        element7.setMultiline(false);
        checkOut11.addBasicElement(element7);
        element7.onAttributesInitialized();
        final PropertyElement checkOut12 = PropertyElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setAttribute("text");
        checkOut12.setName("itemPopupDetail");
        checkOut12.setField("type");
        element7.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        element7.onChildrenAdded();
        checkOut11.onChildrenAdded();
        checkOut8.onChildrenAdded();
        final Container checkOut13 = Container.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setExpandable(false);
        checkOut6.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        final DecoratorAppearance appearance2 = checkOut13.getAppearance();
        appearance2.setElementMap(elementMap);
        checkOut13.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut14 = Margin.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setInsets(new Insets(3, 0, 0, 0));
        appearance2.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        appearance2.onChildrenAdded();
        final RowLayout checkOut15 = RowLayout.checkOut();
        checkOut15.setHorizontal(false);
        checkOut15.setAlign(Alignment9.NORTH);
        checkOut13.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final TextView element8 = new TextView();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setStyle("white11");
        element8.setExpandable(false);
        checkOut13.addBasicElement(element8);
        element8.onAttributesInitialized();
        final RowLayoutData element9 = new RowLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setAlign(Alignment9.EAST);
        element8.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        final PropertyElement checkOut16 = PropertyElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setName("itemPopupDetail");
        checkOut16.setAttribute("text");
        checkOut16.setField("levelDescription");
        element8.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        element8.onChildrenAdded();
        final Container checkOut17 = Container.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setExpandable(false);
        checkOut13.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        final RowLayoutData element10 = new RowLayoutData();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setAlign(Alignment9.EAST);
        checkOut17.addBasicElement(element10);
        element10.onAttributesInitialized();
        element10.onChildrenAdded();
        final PropertyElement checkOut18 = PropertyElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setName("itemPopupDetail");
        checkOut18.setAttribute("visible");
        checkOut18.setField("ap");
        checkOut17.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        final ConditionResult element11 = new ConditionResult();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        checkOut18.addBasicElement(element11);
        element11.onAttributesInitialized();
        final NotEqualCondition element12 = new NotEqualCondition();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setValue("0");
        element11.addBasicElement(element12);
        element12.onAttributesInitialized();
        element12.onChildrenAdded();
        element11.onChildrenAdded();
        checkOut18.onChildrenAdded();
        final Image element13 = new Image();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setStyle("iconAP");
        element13.setExpandable(false);
        checkOut17.addBasicElement(element13);
        element13.onAttributesInitialized();
        element13.onChildrenAdded();
        final Label element14 = new Label();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element14.setStyle("11Light");
        checkOut17.addBasicElement(element14);
        element14.onAttributesInitialized();
        final PropertyElement checkOut19 = PropertyElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setName("itemPopupDetail");
        checkOut19.setAttribute("text");
        checkOut19.setField("ap");
        element14.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        element14.onChildrenAdded();
        checkOut17.onChildrenAdded();
        final Container checkOut20 = Container.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setExpandable(false);
        checkOut13.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        final RowLayoutData element15 = new RowLayoutData();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setAlign(Alignment9.EAST);
        checkOut20.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        final PropertyElement checkOut21 = PropertyElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setName("itemPopupDetail");
        checkOut21.setAttribute("visible");
        checkOut21.setField("range");
        checkOut20.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        final ConditionResult element16 = new ConditionResult();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        checkOut21.addBasicElement(element16);
        element16.onAttributesInitialized();
        final NotNullCondition element17 = new NotNullCondition();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element16.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        element16.onChildrenAdded();
        checkOut21.onChildrenAdded();
        final Image element18 = new Image();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setStyle("smallSword");
        element18.setExpandable(false);
        checkOut20.addBasicElement(element18);
        element18.onAttributesInitialized();
        element18.onChildrenAdded();
        final Label element19 = new Label();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setStyle("11Light");
        checkOut20.addBasicElement(element19);
        element19.onAttributesInitialized();
        final PropertyElement checkOut22 = PropertyElement.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setName("itemPopupDetail");
        checkOut22.setAttribute("text");
        checkOut22.setField("range");
        element19.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        element19.onChildrenAdded();
        checkOut20.onChildrenAdded();
        checkOut13.onChildrenAdded();
        checkOut6.onChildrenAdded();
        final Container checkOut23 = Container.checkOut();
        checkOut23.setElementMap(elementMap);
        checkOut23.setExpandable(false);
        checkOut4.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        final PropertyElement checkOut24 = PropertyElement.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setAttribute("visible");
        checkOut24.setName("itemPopupDetail");
        checkOut24.setField("effect");
        checkOut23.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        final ConditionResult element20 = new ConditionResult();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setValue("false");
        element20.setElseValue("true");
        checkOut24.addBasicElement(element20);
        element20.onAttributesInitialized();
        final EqualCondition element21 = new EqualCondition();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element21.setValue("");
        element20.addBasicElement(element21);
        element21.onAttributesInitialized();
        element21.onChildrenAdded();
        element20.onChildrenAdded();
        checkOut24.onChildrenAdded();
        final RowLayout checkOut25 = RowLayout.checkOut();
        checkOut25.setHorizontal(false);
        checkOut23.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        final Container checkOut26 = Container.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setExpandable(false);
        checkOut26.setStyle("lineSeparator");
        checkOut26.setPrefSize(new Dimension(0, 7));
        checkOut23.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        final DecoratorAppearance appearance3 = checkOut26.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut26.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut27 = Margin.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setInsets(new Insets(5, 0, 2, 0));
        appearance3.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        appearance3.onChildrenAdded();
        checkOut26.onChildrenAdded();
        final Label element22 = new Label();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element22.setExpandable(false);
        element22.setText("%effects.characteristics%".replace("%effects.characteristics%", Xulor.getInstance().getTranslatedString("effects.characteristics")));
        element22.setStyle("11");
        checkOut23.addBasicElement(element22);
        element22.onAttributesInitialized();
        final BorderLayoutData checkOut28 = BorderLayoutData.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setData(BorderLayoutData.Values.CENTER);
        element22.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        final DecoratorAppearance appearance4 = element22.getAppearance();
        appearance4.setElementMap(elementMap);
        element22.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final ColorElement checkOut29 = ColorElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        appearance4.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        checkOut29.onChildrenAdded();
        final Margin checkOut30 = Margin.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setInsets(new Insets(0, 5, 5, 0));
        appearance4.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        appearance4.onChildrenAdded();
        element22.onChildrenAdded();
        final TextView element23 = new TextView();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element23.setStyle("white11");
        element23.setMinWidth(230);
        checkOut23.addBasicElement(element23);
        element23.onAttributesInitialized();
        final PropertyElement checkOut31 = PropertyElement.checkOut();
        checkOut31.setElementMap(elementMap);
        checkOut31.setAttribute("visible");
        checkOut31.setName("itemPopupDetail");
        checkOut31.setField("effectDetails");
        element23.addBasicElement(checkOut31);
        checkOut31.onAttributesInitialized();
        final ConditionResult element24 = new ConditionResult();
        element24.onCheckOut();
        element24.setElementMap(elementMap);
        element24.setValue("false");
        element24.setElseValue("true");
        checkOut31.addBasicElement(element24);
        element24.onAttributesInitialized();
        final OrCondition element25 = new OrCondition();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element24.addBasicElement(element25);
        element25.onAttributesInitialized();
        final EqualCondition element26 = new EqualCondition();
        element26.onCheckOut();
        element26.setElementMap(elementMap);
        element26.setValue("");
        element25.addBasicElement(element26);
        element26.onAttributesInitialized();
        element26.onChildrenAdded();
        final TrueCondition element27 = new TrueCondition();
        element27.onCheckOut();
        element27.setElementMap(elementMap);
        element25.addBasicElement(element27);
        element27.onAttributesInitialized();
        final PropertyElement checkOut32 = PropertyElement.checkOut();
        checkOut32.setElementMap(elementMap);
        checkOut32.setAttribute("comparedValue");
        checkOut32.setName("isFromEquipedShortcut");
        element27.addBasicElement(checkOut32);
        checkOut32.onAttributesInitialized();
        checkOut32.onChildrenAdded();
        element27.onChildrenAdded();
        final TrueCondition element28 = new TrueCondition();
        element28.onCheckOut();
        element28.setElementMap(elementMap);
        element25.addBasicElement(element28);
        element28.onAttributesInitialized();
        final PropertyElement checkOut33 = PropertyElement.checkOut();
        checkOut33.setElementMap(elementMap);
        checkOut33.setAttribute("comparedValue");
        checkOut33.setName("isFromShortcut");
        element28.addBasicElement(checkOut33);
        checkOut33.onAttributesInitialized();
        checkOut33.onChildrenAdded();
        element28.onChildrenAdded();
        element25.onChildrenAdded();
        element24.onChildrenAdded();
        checkOut31.onChildrenAdded();
        final DecoratorAppearance appearance5 = element23.getAppearance();
        appearance5.setElementMap(elementMap);
        element23.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Margin checkOut34 = Margin.checkOut();
        checkOut34.setElementMap(elementMap);
        checkOut34.setInsets(new Insets(0, 20, 0, 0));
        appearance5.addBasicElement(checkOut34);
        checkOut34.onAttributesInitialized();
        checkOut34.onChildrenAdded();
        appearance5.onChildrenAdded();
        final PropertyElement checkOut35 = PropertyElement.checkOut();
        checkOut35.setElementMap(elementMap);
        checkOut35.setName("itemPopupDetail");
        checkOut35.setAttribute("text");
        checkOut35.setField("effectDetails");
        element23.addBasicElement(checkOut35);
        checkOut35.onAttributesInitialized();
        checkOut35.onChildrenAdded();
        element23.onChildrenAdded();
        final TextView element29 = new TextView();
        element29.onCheckOut();
        element29.setElementMap(elementMap);
        element29.setStyle("white11");
        element29.setMinWidth(230);
        element29.setVisible(false);
        checkOut23.addBasicElement(element29);
        element29.onAttributesInitialized();
        final PropertyElement checkOut36 = PropertyElement.checkOut();
        checkOut36.setElementMap(elementMap);
        checkOut36.setAttribute("visible");
        checkOut36.setName("isFromEquipedShortcut");
        element29.addBasicElement(checkOut36);
        checkOut36.onAttributesInitialized();
        final ConditionResult element30 = new ConditionResult();
        element30.onCheckOut();
        element30.setElementMap(elementMap);
        element30.setValue("false");
        element30.setElseValue("true");
        checkOut36.addBasicElement(element30);
        element30.onAttributesInitialized();
        final OrCondition element31 = new OrCondition();
        element31.onCheckOut();
        element31.setElementMap(elementMap);
        element30.addBasicElement(element31);
        element31.onAttributesInitialized();
        final AndCondition element32 = new AndCondition();
        element32.onCheckOut();
        element32.setElementMap(elementMap);
        element31.addBasicElement(element32);
        element32.onAttributesInitialized();
        final FalseCondition element33 = new FalseCondition();
        element33.onCheckOut();
        element33.setElementMap(elementMap);
        element32.addBasicElement(element33);
        element33.onAttributesInitialized();
        element33.onChildrenAdded();
        final FalseCondition element34 = new FalseCondition();
        element34.onCheckOut();
        element34.setElementMap(elementMap);
        element32.addBasicElement(element34);
        element34.onAttributesInitialized();
        this.method0(element34);
        element34.onChildrenAdded();
        element32.onChildrenAdded();
        this.method1(element31);
        element31.onChildrenAdded();
        element30.onChildrenAdded();
        checkOut36.onChildrenAdded();
        this.method2(element29);
        this.method3(element29);
        element29.onChildrenAdded();
        checkOut23.onChildrenAdded();
        checkOut4.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PropertyElement checkOut = PropertyElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setAttribute("comparedValue");
        checkOut.setName("isFromShortcut");
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final EqualCondition element = new EqualCondition();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setValue("");
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final PropertyElement checkOut = PropertyElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setName("itemPopupDetail");
        checkOut.setAttribute("comparedValue");
        checkOut.setField("effect");
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = ((Widget)basicElement).getAppearance();
        appearance.setElementMap(elementMap);
        basicElement.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut = Margin.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setInsets(new Insets(0, 20, 0, 0));
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
        return appearance;
    }
    
    public BasicElement method3(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PropertyElement checkOut = PropertyElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setName("itemPopupDetail");
        checkOut.setAttribute("text");
        checkOut.setField("effectDetails");
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}
