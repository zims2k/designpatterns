package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitAction;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cavalry implements Unit {
    private final String horseName;

    @Override
    public void accept(UnitAction unitActionVisitor) {
        unitActionVisitor.visitCavalry(this);
    }

}
