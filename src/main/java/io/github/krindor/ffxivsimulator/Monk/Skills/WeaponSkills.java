package io.github.krindor.ffxivsimulator.Monk.Skills;

/**
 FFXIV Simulator
 Copyright (C) 2017  Andreas Lund

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class WeaponSkills {
    private String skillname;
    private int potency;
    private String type;
    private int doTPotency;
    private int doTTime;
    private boolean used;

    public WeaponSkills() {
        used = false;
    }

    public void bootshine() {
        skillname = "Bootshine";
        potency = 150;
        type = "Physical";
        doTPotency = 0;
        doTTime = 0;
        used = true;
    }

    public void trueStrike() {
        skillname = "True_Strike";
        potency = 190;
        type = "Physical";
        doTPotency = 0;
        doTTime = 0;
        used = true;
    }

    public void snapPunch() {
        skillname = "Snap_Punch";
        potency = 180;
        type = "Physical";
        doTPotency = 0;
        doTTime = 0;
        used = true;
    }

    public void dragonKick() {
        skillname = "Dragon_Kick";
        potency = 150;
        type = "Physical";
        doTPotency = 0;
        doTTime = 0;
        used = true;
    }

    public void twinSnakes() {
        skillname = "Twin_Snakes";
        potency = 140;
        type = "Physical";
        doTPotency = 0;
        doTTime = 0;
        used = true;
    }

    public void demolish() {
        skillname = "Demolish";
        potency = 70;
        type = "Physical";
        doTPotency = 50;
        doTTime = 21;
        used = true;


    }

    public void touchOfDeath() {
        skillname = "Touch_of_Death";
        potency = 20;
        type = "Physical";
        doTPotency = 25;
        doTTime = 30;
        used = true;
    }

    public String getInfo() {
        return "Name: " + skillname + " " + "Potency: " + potency + " " + "Type: " + type;
    }

    public int getPotency() {
        return potency;
    }

    public int getDoTPotency() {
        return doTPotency;
    }

    public int getDoTTime() {
        return doTTime;
    }

    public String getSkillname() {
        return skillname;
    }

    public String getType() {
        return type;
    }

    public boolean getUsed() {
        return used;
    }
}
