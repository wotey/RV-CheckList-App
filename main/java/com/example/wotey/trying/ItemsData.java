package com.example.wotey.trying;
import android.view.View;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by wotey on 9/11/2016.
 */

    public class ItemsData{


    static ArrayList<String> Added_Items = new ArrayList<String>();
        public static HashMap<String, List<String>> getData() {

            HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


            ArrayList<String> DaysBefore = new ArrayList<String>();
            DaysBefore.add("Print this checklist");
            DaysBefore.add("Print the RV Arrival & Setup Checklist: Trailers");
            DaysBefore.add("Confirm reservations at destination");
            DaysBefore.add("Change postal mail forwarding instructions (hold or start sending to new location)");
            DaysBefore.add("Pay RV bills for current location (ask about deposit refund)");
            DaysBefore.add("Prepare maps and directions");
            DaysBefore.add("Wash laundry (if facilities will not be available during trip)");
            DaysBefore.add("Buy groceries and supplies for trip");
            DaysBefore.add("Check propane bottle levels, fill if needed");
            DaysBefore.add("Check generator fuel levels, fill if needed (keep in mind fuel weight)");
            DaysBefore.add("Check RV battery charge (required for trailer brakes in case of breakaway)");
            DaysBefore.add("Check two-way radio batteries (for communicating with spotter)");
            DaysBefore.add("Check flashlight battery");
            DaysBefore.add("Check tow vehicle fluid levels (oil, transmission, brake, coolant, power steering)");
            DaysBefore.add("Apply grease to hitch mechanism, where needed (FW only)");
            DaysBefore.add("Inspect hitch to make sure it is attached securely to tow vehicle (nuts, bolts, welding, etc.)");
            DaysBefore.add("Close gray tank valves to collect water for flushing sewer hose after dumping black tank");
            DaysBefore.add("Fill fresh water tank to desired level (keep in mind water weight)");


            ArrayList<String> DayOfDeparture = new ArrayList<String>();
            DayOfDeparture.add("Check tow vehicle tire pressure");
            DayOfDeparture.add("Check RV tire pressure");
            DayOfDeparture.add("Check RV wheel lug nut torque");
            DayOfDeparture.add("Fuel up the tow vehicle");
            DayOfDeparture.add("Clean tow vehicle windows and mirrors");
            DayOfDeparture.add("If using an engine tuner (chip, Superchips,etc.) in the the tow vehicle only while not towing, then return engine to \"stock\" programming");
            DayOfDeparture.add("Pick up postal mail");
            DayOfDeparture.add("Arrange breakable items in fridge to prevent breakage");
            DayOfDeparture.add("Fill drinking water containers");

            ArrayList<String> Departure = new ArrayList<String>();
            Departure.add("Lower roof-mounted TV antenna");
            Departure.add("Lower roof-mounted satellite dish (TV & Internet)");
            Departure.add("Collect and store all items from outside the RV (chairs, mats, satellite dishes on tripods, grills, etc.)");
            Departure.add("Secure items inside cabinets and storage compartments");
            Departure.add("Secure items on kitchen sink and counter");
            Departure.add("Secure items on bathroom sink");
            Departure.add("Secure items in shower");
            Departure.add("Secure all other loose items");
            Departure.add("Latch shower and closet doors");
            Departure.add("Latch all cabinet doors (use heavy Velcro strips, rope, or elastic cords for doors likely to open during adverse driving conditions)");
            Departure.add("Latch refrigerator doors");
            Departure.add("Close and latch stove top and oven door");
            Departure.add("Lock tabs on external range hood vent");
            Departure.add("Secure TV's and sliding TV trays");
            Departure.add("Secure other entertainment electronics (stereo, DVD, VCR, etc.)");
            Departure.add("Secure computer and accessories (laptop, monitor, printer)");
            Departure.add("Close roof vents and windows (except those left open for ventilation)");
            Departure.add("Remove decorative and other items from awnings and store (lights, bird feeders, etc.)");
            Departure.add("Stowe and secure awnings");
            Departure.add("Check slide tops for debris and water");
            Departure.add("Move items out of the slides' way inside the RV");
            Departure.add("Move in slides and lock slide mechanism, if available");
            Departure.add("Lay down and pad large items which may fall or shift (chairs, tables, cabinets, etc.)");
            Departure.add("Turn off air conditioning units");
            Departure.add("Confirm that all sliding trays are latched and secure (external storage compartment trays, propane bottle trays, battery trays)");
            Departure.add("Empty black tanks (do this first so sewer hose gets flushed with contents of gray tanks)");
            Departure.add("Close black tank valves");
            Departure.add("Empty gray tanks");
            Departure.add("Close gray tank valves");
            Departure.add("Add treatment chemicals and a small amount of water to black tanks");
            Departure.add("If traveling with pets, make arrangements for their needs (put food, water, bed, leash, etc. into tow vehicle)");
            Departure.add("Disconnect cable TV and telephone line, and store cables");
            Departure.add("Disconnect electricity, and store cable and adapters");
            Departure.add("Disconnect sewer hose, and store hose and relating accessories");
            Departure.add("Disconnect water hose, and store hose and relating accessories");
            Departure.add("Turn off all RV lights (to prevent unnecessary battery drain)");
            Departure.add("Turn off water pump");
            Departure.add("Confirm that refrigerator is running on 12 volt DC or is turned off");
            Departure.add("Turn off all other propane appliances (water heater, furnace)");
            Departure.add("Shut off all propane bottle valves");
            Departure.add("Discard all trash");
            Departure.add("Stowe all remaining external RV features such as hand rails, steps, decks, etc.");
            Departure.add("Secure all items carried on outside or roof of RV (chairs, bicycles, coolers, etc.)");
            Departure.add("Raise or remove all stabilizer jacks (leave front leveling jacks or tongue jacks down)");
            Departure.add("Remove king pin lock, if used (FW only)");
            Departure.add("Lower truck tail gate before backing up for hitching (FW only)");
            Departure.add("Close front storage compartment door (may not close after truck is in hitched position, FW only)");
            Departure.add("Hitch RV to tow vehicle");
            Departure.add("Connect RV breakaway switch cable to the tow vehicle");
            Departure.add("Connect RV umbilical cord to the tow vehicle");
            Departure.add("Attach sway bars (TT only)");
            Departure.add("Attach safety chains (TT only)");
            Departure.add("Raise leveling or tongue jacks");
            Departure.add("Collect and store leveling blocks from under jacks");
            Departure.add("Remove wheel chocks");
            Departure.add("Confirm that all is clear under the RV (all jacks are raised or removed)");
            Departure.add("Confirm that all slides are moved in completely and check overall exterior of RV for protruding items");
            Departure.add("If RV wheels are resting on leveling blocks, move RV off blocks, collect and store blocks");
            Departure.add("Close all internal doors (bathroom, bedroom, living room)");
            Departure.add("Lock all external RV doors and panels");
            Departure.add("Check RV and tow vehicle lights (including signal and break lights)");
            Departure.add("Check RV brakes (three methods: press tow vehicle brake pedal, engage RV brakes only by using trailer brake controller inside tow vehicle, pull breakaway switch cable on RV)");
            Departure.add("Double check that trailer is hitched securely to tow vehicle. Confirm that all safety devices have been correctly applied.");
            Departure.add("Perform a final walk around. Look under and around RV. Confirm all jacks are up and nothing is protruding from sides or roof.");
            Departure.add("Check tow vehicle mirrors, and adjust if necessary");
            Departure.add("Record tow vehicle's starting miles:");
            Departure.add("Leave marker in RV slot, if returning (common markers are tables, chairs, or a vehicle)");
            Departure.add("If you are not certain how much your RV weighs, drive to a truck scale and confirm that all weights are within tow vehicle and trailer ratings (see Understanding RV Weights and Truck Ratings for RV Towing)");


            ArrayList<String> Added_Items = new ArrayList<String>();

            expandableListDetail.put("Added Items", Added_Items);
            expandableListDetail.put("Day of Departure", DayOfDeparture);
            expandableListDetail.put("Departure", Departure);
            expandableListDetail.put("Days Before Departure", DaysBefore);
            return expandableListDetail;
        }
        public static void addItem(String item){
            Added_Items.add(item);

        }
    }

