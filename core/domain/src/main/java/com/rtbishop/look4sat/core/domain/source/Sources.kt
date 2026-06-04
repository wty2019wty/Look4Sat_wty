/*
 * Look4Sat. Amateur radio satellite tracker and pass predictor.
 * Copyright (C) 2019-2026 Arty Bishop and contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.rtbishop.look4sat.core.domain.source

object Sources {
    val satelliteDataUrls = mapOf(
        "All" to "https://tle2.486520.xyz/data/All.csv",
        "Amateur" to "https://tle2.486520.xyz/data/",
        "Brightest" to "https://tle2.486520.xyz/data/",
        "Cubesat" to "https://tle2.486520.xyz/data/",
        "Education" to "https://tle2.486520.xyz/data/",
        "Engineer" to "https://tle2.486520.xyz/data/",
        "Geostationary" to "https://tle2.486520.xyz/data/",
        "Globalstar" to "https://tle2.486520.xyz/data/",
        "GNSS" to "https://tle2.486520.xyz/data/",
        "Intelsat" to "https://tle2.486520.xyz/data/Intelsat.csv",
        "Iridium" to "https://tle2.486520.xyz/data/Iridium.csv",
        "Military" to "https://tle2.486520.xyz/data/Military.csv",
        "New" to "https://tle2.486520.xyz/data/New.csv",
        "OneWeb" to "https://tle2.486520.xyz/data/OneWeb.csv",
        "Orbcomm" to "https://tle2.486520.xyz/data/Orbcomm.csv",
        "Resource" to "https://tle2.486520.xyz/data/Resource.csv",
        "SatNOGS" to "https://tle2.486520.xyz/data/SatNOGS_Celestrak.csv",
        "Science" to "https://tle2.486520.xyz/data/Science.csv",
        "Spire" to "https://tle2.486520.xyz/data/Spire.csv",
        "Starlink" to "https://tle2.486520.xyz/data/Starlink.csv",
        "Swarm" to "https://tle2.486520.xyz/data/Swarm.csv",
        "Weather" to "https://tle2.486520.xyz/data/Weather.csv",
        "X-Comm" to "https://tle2.486520.xyz/data/X-Comm.csv",
        "Amsat" to "https://tle2.486520.xyz/data/Amsat.txt",
        "Classified" to "https://tle2.486520.xyz/data/Classified.zip",
        "McCants" to "https://tle2.486520.xyz/data/McCants.zip",
        "R4UAB" to "https://tle2.486520.xyz/data/R4UAB.txt",
        "Other" to "" // key for sats filter
    )
    val transceiversDataUrls = mapOf(
        "SatNOGS" to "https://tle2.486520.xyz/data/SatNOGS_API.json"
    )
}