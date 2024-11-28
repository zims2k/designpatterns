package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitVisitor;

public interface Unit {
    /** visitor pattern implementation */
    void accept(UnitVisitor unitAction);
}
