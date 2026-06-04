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
        "All" to "https://tle2.486520.xyz/data/All.txt",
        "Amateur" to "https://tle2.486520.xyz/data/Amateur.txt",
        "Brightest" to "https://tle2.486520.xyz/data/Brightest.txt",
        "Cubesat" to "https://tle2.486520.xyz/data/Cubesat.txt",
        "Education" to "https://tle2.486520.xyz/data/Education.txt",
        "Engineer" to "https://tle2.486520.xyz/data/Engineer.txt",
        "Geostationary" to "https://tle2.486520.xyz/data/Geostationary.txt",
        "Globalstar" to "https://tle2.486520.xyz/data/Globalstar.txt",
        "GNSS" to "https://tle2.486520.xyz/data/GNSS.txt",
        "Intelsat" to "https://tle2.486520.xyz/data/Intelsat.txt",
        "Iridium" to "https://tle2.486520.xyz/data/Iridium.txt",
        "Military" to "https://tle2.486520.xyz/data/Military.txt",
        "New" to "https://tle2.486520.xyz/data/New.txt",
        "OneWeb" to "https://tle2.486520.xyz/data/OneWeb.txt",
        "Orbcomm" to "https://tle2.486520.xyz/data/Orbcomm.txt",
        "Resource" to "https://tle2.486520.xyz/data/Resource.txt",
        "SatNOGS" to "https://tle2.486520.xyz/data/SatNOGS_Celestrak.txt",
        "Science" to "https://tle2.486520.xyz/data/Science.txt",
        "Spire" to "https://tle2.486520.xyz/data/Spire.txt",
        "Starlink" to "https://tle2.486520.xyz/data/Starlink.txt",
        "Swarm" to "https://tle2.486520.xyz/data/Swarm.txt",
        "Weather" to "https://tle2.486520.xyz/data/Weather.txt",
        "X-Comm" to "https://tle2.486520.xyz/data/X-Comm.txt",
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