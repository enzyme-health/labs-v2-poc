package com.wheel.labsv2.constants;

import java.util.HashMap;
import java.util.Map;

public enum USStateCode {

    ALABAMA("Alabama", "AL"),
    ALASKA("Alaska", "AK"),
    AMERICAN_SAMOA("American Samoa", "AS"),
    ARIZONA("Arizona", "AZ"),
    ARKANSAS("Arkansas", "AR"),
    CALIFORNIA("California", "CA"),
    COLORADO("Colorado", "CO"),
    CONNECTICUT("Connecticut", "CT"),
    DELAWARE("Delaware", "DE"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "DC"),
    FEDERATED_STATES_OF_MICRONESIA("Federated States of Micronesia", "FM"),
    FLORIDA("Florida", "FL"),
    GEORGIA("Georgia", "GA"),
    GUAM("Guam", "GU"),
    HAWAII("Hawaii", "HI"),
    IDAHO("Idaho", "ID"),
    ILLINOIS("Illinois", "IL"),
    INDIANA("Indiana", "IN"),
    IOWA("Iowa", "IA"),
    KANSAS("Kansas", "KS"),
    KENTUCKY("Kentucky", "KY"),
    LOUISIANA("Louisiana", "LA"),
    MAINE("Maine", "ME"),
    MARYLAND("Maryland", "MD"),
    MARSHALL_ISLANDS("Marshall Islands", "MH"),
    MASSACHUSETTS("Massachusetts", "MA"),
    MICHIGAN("Michigan", "MI"),
    MINNESOTA("Minnesota", "MN"),
    MISSISSIPPI("Mississippi", "MS"),
    MISSOURI("Missouri", "MO"),
    MONTANA("Montana", "MT"),
    NEBRASKA("Nebraska", "NE"),
    NEVADA("Nevada", "NV"),
    NEW_HAMPSHIRE("New Hampshire", "NH"),
    NEW_JERSEY("New Jersey", "NJ"),
    NEW_MEXICO("New Mexico", "NM"),
    NEW_YORK("New York", "NY"),
    NORTH_CAROLINA("North Carolina", "NC"),
    NORTH_DAKOTA("North Dakota", "ND"),
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", "MP"),
    OHIO("Ohio", "OH"),
    OKLAHOMA("Oklahoma", "OK"),
    OREGON("Oregon", "OR"),
    PALAU("Palau", "PW"),
    PENNSYLVANIA("Pennsylvania", "PA"),
    PUERTO_RICO("Puerto Rico", "PR"),
    RHODE_ISLAND("Rhode Island", "RI"),
    SOUTH_CAROLINA("South Carolina", "SC"),
    SOUTH_DAKOTA("South Dakota", "SD"),
    TENNESSEE("Tennessee", "TN"),
    TEXAS("Texas", "TX"),
    UTAH("Utah", "UT"),
    VERMONT("Vermont", "VT"),
    VIRGIN_ISLANDS("Virgin Islands", "VI"),
    VIRGINIA("Virginia", "VA"),
    WASHINGTON("Washington", "WA"),
    WEST_VIRGINIA("West Virginia", "WV"),
    WISCONSIN("Wisconsin", "WI"),
    WYOMING("Wyoming", "WY");

    /**
     * The set of states addressed by abbreviations.
     */
    private static final Map<String, USStateCode> STATES_BY_ABBR = new HashMap<String, USStateCode>();

    static {
        for (USStateCode state : values()) {
            STATES_BY_ABBR.put(
                state.getAbbreviation(),
                state
            );
        }
    }

    private final String _abbreviation;
    private final String _name;

    USStateCode(
        final String name,
        final String abbreviation
    ) {
        _name = name;
        _abbreviation = abbreviation;
    }

    /**
     * Try to find the state code from either the name or the abbreviation
     */
    public static USStateCode parseState(final String nameOrAbbr) {
        USStateCode stateCode = valueOfName(nameOrAbbr);
        if (stateCode == null) {
            stateCode = valueOfAbbreviation(nameOrAbbr);
        }
        return stateCode;
    }

    /**
     * Gets the enum constant with the specified abbreviation.
     *
     * @param abbr the state's two-letter state code.
     * @return the enum constant with the specified abbreviation.
     */
    public static USStateCode valueOfAbbreviation(final String abbr) {
        return STATES_BY_ABBR.get(abbr);
    }

    public static USStateCode valueOfName(final String name) {
        final String enumName = name.toUpperCase()
            .replaceAll(
                " ",
                "_"
            );
        try {
            return valueOf(enumName);
        } catch(final IllegalArgumentException e) {
            return null;
        }
    }

    /**
     * @return String - Two-letter state code
     */
    public String getAbbreviation() {
        return _abbreviation;
    }

    @Override
    public String toString() {
        return _abbreviation;
    }
}
