package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitAction;

public interface Unit {
    /** visitor pattern implementation */
    void accept(UnitAction unitVisitor);
}
