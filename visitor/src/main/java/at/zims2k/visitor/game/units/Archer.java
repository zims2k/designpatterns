package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitAction;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Archer implements Unit {
    private final String archType;

    @Override
    public void accept(UnitAction unitActionVisitor) {
        unitActionVisitor.visitArcher(this);
    }
}
