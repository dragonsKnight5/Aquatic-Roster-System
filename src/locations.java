/*
 * Copyright 2016 james.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *
 * @author james
 */
public class locations {
    
    final private int ID;
    private String location;
    private boolean lifeguard;
    private boolean lts;
    private boolean gym;
    private boolean isc;
    
    public locations(int inID, String inLocation, boolean inLifeguard, boolean inLts, boolean inGym, boolean inIsc)
    {
        ID = inID;
        location = inLocation;
        lifeguard = inLifeguard;
        lts = inLts;
        gym = inGym;
        isc = inIsc;
    }
    
    public String toString()
    {
        return location;
    }
    
    public int getID()
    {
        return ID;
    }
    public String getLocation()
    {
        return location;
    }
    
    public boolean getLifeguard()
    {
        return lifeguard;
    }
    
    public boolean getLTS()
    {
        return lts;
    }
    
    public boolean getGym()
    {
        return gym;
    }
    
    public boolean getIsc()
    {
        return isc;
    }
}
