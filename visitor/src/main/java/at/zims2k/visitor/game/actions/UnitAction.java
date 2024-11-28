package at.zims2k.visitor.game.actions;

import at.zims2k.visitor.game.units.AbstractUnit;

public interface UnitAction {

    void visitAbstractUnit(AbstractUnit unit);
}
