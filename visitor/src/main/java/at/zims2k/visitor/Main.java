package at.zims2k.visitor;

import at.zims2k.visitor.game.actions.AttackAction;
import at.zims2k.visitor.game.units.Archer;
import at.zims2k.visitor.game.units.Cavalry;
import at.zims2k.visitor.game.units.Spearman;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer("superArcher");
        Cavalry cavalry = new Cavalry("superCavalryHorse");
        Spearman spearman = new Spearman("superSpearmanMetal");

        archer.accept(new AttackAction());
    }
}
