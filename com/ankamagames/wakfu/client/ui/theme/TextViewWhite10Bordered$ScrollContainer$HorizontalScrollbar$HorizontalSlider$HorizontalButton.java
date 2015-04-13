package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.framework.graphics.engine.geometry.*;
import com.ankamagames.xulor2.appearance.*;

public class TextViewWhite10Bordered$ScrollContainer$HorizontalScrollbar$HorizontalSlider$HorizontalButton implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public TextViewWhite10Bordered$ScrollContainer$HorizontalScrollbar$HorizontalSlider$HorizontalButton() {
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
        appearance.setState("default");
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final PixmapBorder element = new PixmapBorder();
        element.onCheckOut();
        element.setElementMap(elementMap);
        appearance.addBasicElement(element);
        element.onAttributesInitialized();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(4);
        checkOut.setPosition(Alignment17.NORTH_WEST);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(4);
        checkOut.setX(892);
        checkOut.setY(240);
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(4);
        checkOut2.setPosition(Alignment17.NORTH);
        checkOut2.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut2.setWidth(5);
        checkOut2.setX(713);
        checkOut2.setY(216);
        element.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(4);
        checkOut3.setPosition(Alignment17.NORTH_EAST);
        checkOut3.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut3.setWidth(4);
        checkOut3.setX(538);
        checkOut3.setY(254);
        element.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(13);
        checkOut4.setPosition(Alignment17.EAST);
        checkOut4.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut4.setWidth(4);
        checkOut4.setX(876);
        checkOut4.setY(733);
        element.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(4);
        checkOut5.setPosition(Alignment17.SOUTH_EAST);
        checkOut5.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut5.setWidth(4);
        checkOut5.setX(977);
        checkOut5.setY(211);
        element.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(4);
        checkOut6.setPosition(Alignment17.SOUTH);
        checkOut6.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut6.setWidth(5);
        checkOut6.setX(936);
        checkOut6.setY(221);
        element.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(4);
        checkOut7.setPosition(Alignment17.SOUTH_WEST);
        checkOut7.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut7.setWidth(4);
        checkOut7.setX(834);
        checkOut7.setY(225);
        element.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(13);
        checkOut8.setPosition(Alignment17.WEST);
        checkOut8.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut8.setWidth(4);
        checkOut8.setX(974);
        checkOut8.setY(596);
        element.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        element.onChildrenAdded();
        final PixmapBackground checkOut9 = PixmapBackground.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setEnabled(true);
        checkOut9.setScaled(true);
        appearance.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(1);
        checkOut10.setPosition(Alignment17.CENTER);
        checkOut10.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut10.setWidth(4);
        checkOut10.setX(939);
        checkOut10.setY(201);
        checkOut9.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut11 = PixmapElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setHeight(6);
        checkOut11.setPosition(Alignment17.CENTER);
        checkOut11.setRotation(GeometrySprite.SpriteRotation.QUARTER_CLOCKWISE);
        checkOut11.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut11.setWidth(4);
        checkOut11.setX(403);
        checkOut11.setY(279);
        appearance.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final PixmapBorder element2 = new PixmapBorder();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        appearance2.addBasicElement(element2);
        element2.onAttributesInitialized();
        final PixmapElement checkOut12 = PixmapElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setHeight(4);
        checkOut12.setPosition(Alignment17.NORTH_WEST);
        checkOut12.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut12.setWidth(4);
        checkOut12.setX(805);
        checkOut12.setY(192);
        element2.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        final PixmapElement checkOut13 = PixmapElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setHeight(4);
        checkOut13.setPosition(Alignment17.NORTH);
        checkOut13.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut13.setWidth(5);
        checkOut13.setX(215);
        checkOut13.setY(209);
        element2.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        final PixmapElement checkOut14 = PixmapElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setHeight(4);
        checkOut14.setPosition(Alignment17.NORTH_EAST);
        checkOut14.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut14.setWidth(4);
        checkOut14.setX(538);
        checkOut14.setY(240);
        element2.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final PixmapElement checkOut15 = PixmapElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setHeight(13);
        checkOut15.setPosition(Alignment17.EAST);
        checkOut15.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut15.setWidth(4);
        checkOut15.setX(876);
        checkOut15.setY(749);
        element2.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final PixmapElement checkOut16 = PixmapElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setHeight(4);
        checkOut16.setPosition(Alignment17.SOUTH_EAST);
        checkOut16.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut16.setWidth(4);
        checkOut16.setX(834);
        checkOut16.setY(232);
        element2.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final PixmapElement checkOut17 = PixmapElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setHeight(4);
        checkOut17.setPosition(Alignment17.SOUTH);
        checkOut17.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut17.setWidth(5);
        checkOut17.setX(895);
        checkOut17.setY(481);
        element2.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        final PixmapElement checkOut18 = PixmapElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setHeight(4);
        checkOut18.setPosition(Alignment17.SOUTH_WEST);
        checkOut18.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut18.setWidth(4);
        checkOut18.setX(892);
        checkOut18.setY(247);
        element2.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        final PixmapElement checkOut19 = PixmapElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setHeight(13);
        checkOut19.setPosition(Alignment17.WEST);
        checkOut19.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut19.setWidth(4);
        checkOut19.setX(134);
        checkOut19.setY(611);
        element2.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        element2.onChildrenAdded();
        final PixmapBackground checkOut20 = PixmapBackground.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setEnabled(true);
        checkOut20.setScaled(true);
        appearance2.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        final PixmapElement checkOut21 = PixmapElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setHeight(2);
        checkOut21.setPosition(Alignment17.CENTER);
        checkOut21.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut21.setWidth(4);
        checkOut21.setX(193);
        checkOut21.setY(622);
        checkOut20.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        checkOut20.onChildrenAdded();
        final PixmapElement checkOut22 = PixmapElement.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setHeight(6);
        checkOut22.setPosition(Alignment17.CENTER);
        checkOut22.setRotation(GeometrySprite.SpriteRotation.QUARTER_CLOCKWISE);
        checkOut22.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut22.setWidth(4);
        checkOut22.setX(46);
        checkOut22.setY(386);
        appearance2.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        appearance3.setState("pressed");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final PixmapBorder element3 = new PixmapBorder();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        appearance3.addBasicElement(element3);
        element3.onAttributesInitialized();
        final PixmapElement checkOut23 = PixmapElement.checkOut();
        checkOut23.setElementMap(elementMap);
        checkOut23.setHeight(4);
        checkOut23.setPosition(Alignment17.NORTH_WEST);
        checkOut23.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut23.setWidth(4);
        checkOut23.setX(713);
        checkOut23.setY(202);
        element3.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        checkOut23.onChildrenAdded();
        final PixmapElement checkOut24 = PixmapElement.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setHeight(4);
        checkOut24.setPosition(Alignment17.NORTH);
        checkOut24.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut24.setWidth(5);
        checkOut24.setX(215);
        checkOut24.setY(202);
        element3.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        checkOut24.onChildrenAdded();
        final PixmapElement checkOut25 = PixmapElement.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setHeight(4);
        checkOut25.setPosition(Alignment17.NORTH_EAST);
        checkOut25.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut25.setWidth(4);
        checkOut25.setX(1015);
        checkOut25.setY(193);
        element3.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        final PixmapElement checkOut26 = PixmapElement.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setHeight(13);
        checkOut26.setPosition(Alignment17.EAST);
        checkOut26.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut26.setWidth(4);
        checkOut26.setX(828);
        checkOut26.setY(9);
        element3.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        checkOut26.onChildrenAdded();
        final PixmapElement checkOut27 = PixmapElement.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setHeight(4);
        checkOut27.setPosition(Alignment17.SOUTH_EAST);
        checkOut27.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut27.setWidth(4);
        checkOut27.setX(110);
        checkOut27.setY(219);
        element3.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        final PixmapElement checkOut28 = PixmapElement.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setHeight(4);
        checkOut28.setPosition(Alignment17.SOUTH);
        checkOut28.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut28.setWidth(5);
        checkOut28.setX(684);
        checkOut28.setY(356);
        element3.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        final PixmapElement checkOut29 = PixmapElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setHeight(4);
        checkOut29.setPosition(Alignment17.SOUTH_WEST);
        checkOut29.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut29.setWidth(4);
        checkOut29.setX(834);
        checkOut29.setY(253);
        element3.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        checkOut29.onChildrenAdded();
        final PixmapElement checkOut30 = PixmapElement.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setHeight(13);
        checkOut30.setPosition(Alignment17.WEST);
        checkOut30.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut30.setWidth(4);
        checkOut30.setX(876);
        checkOut30.setY(717);
        element3.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        element3.onChildrenAdded();
        final PixmapBackground checkOut31 = PixmapBackground.checkOut();
        checkOut31.setElementMap(elementMap);
        checkOut31.setEnabled(true);
        checkOut31.setScaled(true);
        appearance3.addBasicElement(checkOut31);
        checkOut31.onAttributesInitialized();
        final PixmapElement checkOut32 = PixmapElement.checkOut();
        checkOut32.setElementMap(elementMap);
        checkOut32.setHeight(2);
        checkOut32.setPosition(Alignment17.CENTER);
        checkOut32.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut32.setWidth(4);
        checkOut32.setX(690);
        checkOut32.setY(214);
        checkOut31.addBasicElement(checkOut32);
        checkOut32.onAttributesInitialized();
        checkOut32.onChildrenAdded();
        checkOut31.onChildrenAdded();
        final PixmapElement checkOut33 = PixmapElement.checkOut();
        checkOut33.setElementMap(elementMap);
        checkOut33.setHeight(6);
        checkOut33.setPosition(Alignment17.CENTER);
        checkOut33.setRotation(GeometrySprite.SpriteRotation.QUARTER_CLOCKWISE);
        checkOut33.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut33.setWidth(4);
        checkOut33.setX(134);
        checkOut33.setY(587);
        appearance3.addBasicElement(checkOut33);
        checkOut33.onAttributesInitialized();
        checkOut33.onChildrenAdded();
        appearance3.onChildrenAdded();
    }
}
