package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitActionVisitor;

public interface Unit {
    /** visitor pattern implementation */
    void accept(UnitActionVisitor unitAction);
}
