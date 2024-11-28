package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitVisitor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Spearman implements Unit {
    private final String tipMetalType;

    @Override
    public void accept(UnitVisitor unitVIsitor) {

    }
}
