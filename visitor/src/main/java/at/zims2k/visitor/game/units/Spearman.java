package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitAction;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Spearman implements Unit {
    private final String spearTipMetalType;

    @Override
    public void accept(UnitAction unitActionVisitor) {
        unitActionVisitor.visitSpearman(this);
    }

}
