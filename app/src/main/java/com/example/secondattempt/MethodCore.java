package com.example.secondattempt;

public class MethodCore {

    public int[] Turns1 = new int[9];
    int TurnDecider = 0;

    public boolean Winner()
    {
        if(Turns1[0] == Turns1[1] && Turns1[1] == Turns1[2])
        {
            return true;
        }
        else if((Turns1[3]== 1 || Turns1[3] == 0 ) && Turns1[3] == Turns1[4] && Turns1[4] == Turns1[5])
        {
            return true;
        }
        else if(Turns1[6] == Turns1[7] && Turns1[7] == Turns1[8])
        {
            return true;
        }

        else if (Turns1[0] == Turns1[3] && Turns1[3] == Turns1[6])
        {
            return true;
        }
        else if (Turns1[1] == Turns1[4] && Turns1[4] == Turns1[7])
        {
            return true;
        }
        else if (Turns1[2] == Turns1[5] && Turns1[5] == Turns1[8])
        {
            return true;
        }

        else if (Turns1[6] == Turns1[4] && Turns1[4] == Turns1[2])
        {
            return true;
        }
        else if (Turns1[0] == Turns1[4] && Turns1[4] == Turns1[8])
        {
            return true;
        }
        return false;
    }

    public boolean Switcher(boolean Original)
    {
        return !Original;
    }

    public String Turn(boolean Switched, int BtnNumber)
    {
        char PlayerChar;
        if (Switched)
        {
            PlayerChar = 'X';
            TurnDecider = 1;
        }
        else
        {
            PlayerChar = 'O';
            TurnDecider = 0;
        }
        
        Turns1[BtnNumber-1] = TurnDecider;
        return Character.toString(PlayerChar);
    }
}
