package ru.shulenin;

import ru.shulenin.pattern.GoblinArmyFabric;
import ru.shulenin.pattern.OrkArmyFabric;
import ru.shulenin.pattern.UnitFabric;
import ru.shulenin.unit.Unit;
import ru.shulenin.unit.UnitType;

public class Main {
    public static void main(String[] args) {
        UnitFabric orkArmyFabric = new OrkArmyFabric();
        UnitFabric goblinArmyFabric = new GoblinArmyFabric();

        Unit goblinWarrior = goblinArmyFabric.getUnit(UnitType.WARRIOR);
        Unit goblinWarmaster = goblinArmyFabric.getUnit(UnitType.WARMASTER);

        Unit orkWarrior = orkArmyFabric.getUnit(UnitType.WARRIOR);
        Unit orkWarmaster = orkArmyFabric.getUnit(UnitType.WARMASTER);

        System.out.println("Goblins:");
        System.out.println(goblinWarrior.getName());
        System.out.println(goblinWarmaster.getName());

        System.out.println();

        System.out.println("Orks:");
        System.out.println(orkWarrior.getName());
        System.out.println(orkWarmaster.getName());
    }
}
