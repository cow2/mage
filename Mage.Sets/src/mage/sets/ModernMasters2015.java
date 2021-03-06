/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
*/

package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.SetType;
import mage.constants.Rarity;

/**
 *
 * @author fireshoes
 */
public class ModernMasters2015 extends ExpansionSet {

    private static final ModernMasters2015 fINSTANCE = new ModernMasters2015();

    public static ModernMasters2015 getInstance() {
        return fINSTANCE;
    }

    private ModernMasters2015() {
        super("Modern Masters 2015", "MM2", ExpansionSet.buildDate(2015, 5, 22), SetType.SUPPLEMENTAL);
        this.blockName = "Reprint";
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Aethersnipe", 39, Rarity.COMMON, mage.cards.a.Aethersnipe.class));
        cards.add(new SetCardInfo("Agony Warp", 170, Rarity.UNCOMMON, mage.cards.a.AgonyWarp.class));
        cards.add(new SetCardInfo("Air Servant", 40, Rarity.UNCOMMON, mage.cards.a.AirServant.class));
        cards.add(new SetCardInfo("Algae Gharial", 137, Rarity.UNCOMMON, mage.cards.a.AlgaeGharial.class));
        cards.add(new SetCardInfo("All Is Dust", 1, Rarity.RARE, mage.cards.a.AllIsDust.class));
        cards.add(new SetCardInfo("Alloy Myr", 201, Rarity.COMMON, mage.cards.a.AlloyMyr.class));
        cards.add(new SetCardInfo("All Suns' Dawn", 138, Rarity.RARE, mage.cards.a.AllSunsDawn.class));
        cards.add(new SetCardInfo("Ant Queen", 139, Rarity.RARE, mage.cards.a.AntQueen.class));
        cards.add(new SetCardInfo("Apocalypse Hydra", 171, Rarity.RARE, mage.cards.a.ApocalypseHydra.class));
        cards.add(new SetCardInfo("Apostle's Blessing", 8, Rarity.COMMON, mage.cards.a.ApostlesBlessing.class));
        cards.add(new SetCardInfo("Aquastrand Spider", 140, Rarity.COMMON, mage.cards.a.AquastrandSpider.class));
        cards.add(new SetCardInfo("Argent Sphinx", 41, Rarity.RARE, mage.cards.a.ArgentSphinx.class));
        cards.add(new SetCardInfo("Arrest", 9, Rarity.COMMON, mage.cards.a.Arrest.class));
        cards.add(new SetCardInfo("Artisan of Kozilek", 2, Rarity.UNCOMMON, mage.cards.a.ArtisanOfKozilek.class));
        cards.add(new SetCardInfo("Ashenmoor Gouger", 190, Rarity.UNCOMMON, mage.cards.a.AshenmoorGouger.class));
        cards.add(new SetCardInfo("Azorius Chancery", 235, Rarity.UNCOMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Banefire", 104, Rarity.RARE, mage.cards.b.Banefire.class));
        cards.add(new SetCardInfo("Battlegrace Angel", 10, Rarity.RARE, mage.cards.b.BattlegraceAngel.class));
        cards.add(new SetCardInfo("Bestial Menace", 141, Rarity.UNCOMMON, mage.cards.b.BestialMenace.class));
        cards.add(new SetCardInfo("Bitterblossom", 71, Rarity.MYTHIC, mage.cards.b.Bitterblossom.class));
        cards.add(new SetCardInfo("Blades of Velis Vel", 105, Rarity.COMMON, mage.cards.b.BladesOfVelisVel.class));
        cards.add(new SetCardInfo("Blinding Souleater", 202, Rarity.COMMON, mage.cards.b.BlindingSouleater.class));
        cards.add(new SetCardInfo("Blinkmoth Nexus", 236, Rarity.RARE, mage.cards.b.BlinkmothNexus.class));
        cards.add(new SetCardInfo("Blood Ogre", 106, Rarity.COMMON, mage.cards.b.BloodOgre.class));
        cards.add(new SetCardInfo("Bloodshot Trainee", 107, Rarity.UNCOMMON, mage.cards.b.BloodshotTrainee.class));
        cards.add(new SetCardInfo("Bloodthrone Vampire", 72, Rarity.COMMON, mage.cards.b.BloodthroneVampire.class));
        cards.add(new SetCardInfo("Bone Splinters", 73, Rarity.COMMON, mage.cards.b.BoneSplinters.class));
        cards.add(new SetCardInfo("Boros Garrison", 237, Rarity.UNCOMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Swiftblade", 172, Rarity.UNCOMMON, mage.cards.b.BorosSwiftblade.class));
        cards.add(new SetCardInfo("Brute Force", 108, Rarity.COMMON, mage.cards.b.BruteForce.class));
        cards.add(new SetCardInfo("Burst Lightning", 109, Rarity.COMMON, mage.cards.b.BurstLightning.class));
        cards.add(new SetCardInfo("Cathodion", 203, Rarity.COMMON, mage.cards.c.Cathodion.class));
        cards.add(new SetCardInfo("Celestial Purge", 11, Rarity.UNCOMMON, mage.cards.c.CelestialPurge.class));
        cards.add(new SetCardInfo("Chimeric Mass", 204, Rarity.RARE, mage.cards.c.ChimericMass.class));
        cards.add(new SetCardInfo("Cloud Elemental", 42, Rarity.COMMON, mage.cards.c.CloudElemental.class));
        cards.add(new SetCardInfo("Combust", 110, Rarity.UNCOMMON, mage.cards.c.Combust.class));
        cards.add(new SetCardInfo("Comet Storm", 111, Rarity.MYTHIC, mage.cards.c.CometStorm.class));
        cards.add(new SetCardInfo("Commune with Nature", 142, Rarity.COMMON, mage.cards.c.CommuneWithNature.class));
        cards.add(new SetCardInfo("Conclave Phalanx", 12, Rarity.COMMON, mage.cards.c.ConclavePhalanx.class));
        cards.add(new SetCardInfo("Copper Carapace", 205, Rarity.COMMON, mage.cards.c.CopperCarapace.class));
        cards.add(new SetCardInfo("Court Homunculus", 13, Rarity.COMMON, mage.cards.c.CourtHomunculus.class));
        cards.add(new SetCardInfo("Cranial Plating", 206, Rarity.UNCOMMON, mage.cards.c.CranialPlating.class));
        cards.add(new SetCardInfo("Creakwood Liege", 191, Rarity.RARE, mage.cards.c.CreakwoodLiege.class));
        cards.add(new SetCardInfo("Cryptic Command", 43, Rarity.RARE, mage.cards.c.CrypticCommand.class));
        cards.add(new SetCardInfo("Culling Dais", 207, Rarity.UNCOMMON, mage.cards.c.CullingDais.class));
        cards.add(new SetCardInfo("Cytoplast Root-Kin", 143, Rarity.UNCOMMON, mage.cards.c.CytoplastRootKin.class));
        cards.add(new SetCardInfo("Daggerclaw Imp", 74, Rarity.UNCOMMON, mage.cards.d.DaggerclawImp.class));
        cards.add(new SetCardInfo("Dark Confidant", 75, Rarity.MYTHIC, mage.cards.d.DarkConfidant.class));
        cards.add(new SetCardInfo("Darksteel Axe", 208, Rarity.UNCOMMON, mage.cards.d.DarksteelAxe.class));
        cards.add(new SetCardInfo("Darksteel Citadel", 238, Rarity.COMMON, mage.cards.d.DarksteelCitadel.class));
        cards.add(new SetCardInfo("Daybreak Coronet", 14, Rarity.RARE, mage.cards.d.DaybreakCoronet.class));
        cards.add(new SetCardInfo("Death Denied", 76, Rarity.COMMON, mage.cards.d.DeathDenied.class));
        cards.add(new SetCardInfo("Deathmark", 77, Rarity.UNCOMMON, mage.cards.d.Deathmark.class));
        cards.add(new SetCardInfo("Devouring Greed", 78, Rarity.UNCOMMON, mage.cards.d.DevouringGreed.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 239, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dimir Guildmage", 192, Rarity.UNCOMMON, mage.cards.d.DimirGuildmage.class));
        cards.add(new SetCardInfo("Dismember", 79, Rarity.UNCOMMON, mage.cards.d.Dismember.class));
        cards.add(new SetCardInfo("Dispatch", 15, Rarity.UNCOMMON, mage.cards.d.Dispatch.class));
        cards.add(new SetCardInfo("Dragonsoul Knight", 112, Rarity.COMMON, mage.cards.d.DragonsoulKnight.class));
        cards.add(new SetCardInfo("Dread Drone", 80, Rarity.COMMON, mage.cards.d.DreadDrone.class));
        cards.add(new SetCardInfo("Drooling Groodion", 173, Rarity.UNCOMMON, mage.cards.d.DroolingGroodion.class));
        cards.add(new SetCardInfo("Duskhunter Bat", 81, Rarity.COMMON, mage.cards.d.DuskhunterBat.class));
        cards.add(new SetCardInfo("Eldrazi Temple", 240, Rarity.UNCOMMON, mage.cards.e.EldraziTemple.class));
        cards.add(new SetCardInfo("Electrolyze", 174, Rarity.UNCOMMON, mage.cards.e.Electrolyze.class));
        cards.add(new SetCardInfo("Elesh Norn, Grand Cenobite", 16, Rarity.MYTHIC, mage.cards.e.EleshNornGrandCenobite.class));
        cards.add(new SetCardInfo("Emrakul, the Aeons Torn", 3, Rarity.MYTHIC, mage.cards.e.EmrakulTheAeonsTorn.class));
        cards.add(new SetCardInfo("Endrek Sahr, Master Breeder", 82, Rarity.RARE, mage.cards.e.EndrekSahrMasterBreeder.class));
        cards.add(new SetCardInfo("Etched Champion", 209, Rarity.RARE, mage.cards.e.EtchedChampion.class));
        cards.add(new SetCardInfo("Etched Monstrosity", 210, Rarity.RARE, mage.cards.e.EtchedMonstrosity.class));
        cards.add(new SetCardInfo("Etched Oracle", 211, Rarity.UNCOMMON, mage.cards.e.EtchedOracle.class));
        cards.add(new SetCardInfo("Ethercaste Knight", 175, Rarity.UNCOMMON, mage.cards.e.EthercasteKnight.class));
        cards.add(new SetCardInfo("Everflowing Chalice", 212, Rarity.UNCOMMON, mage.cards.e.EverflowingChalice.class));
        cards.add(new SetCardInfo("Evolving Wilds", 241, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Expedition Map", 213, Rarity.UNCOMMON, mage.cards.e.ExpeditionMap.class));
        cards.add(new SetCardInfo("Eye of Ugin", 242, Rarity.RARE, mage.cards.e.EyeOfUgin.class));
        cards.add(new SetCardInfo("Faerie Mechanist", 44, Rarity.COMMON, mage.cards.f.FaerieMechanist.class));
        cards.add(new SetCardInfo("Fiery Fall", 113, Rarity.COMMON, mage.cards.f.FieryFall.class));
        cards.add(new SetCardInfo("Flashfreeze", 45, Rarity.UNCOMMON, mage.cards.f.Flashfreeze.class));
        cards.add(new SetCardInfo("Flayer Husk", 214, Rarity.COMMON, mage.cards.f.FlayerHusk.class));
        cards.add(new SetCardInfo("Fortify", 17, Rarity.COMMON, mage.cards.f.Fortify.class));
        cards.add(new SetCardInfo("Frogmite", 215, Rarity.COMMON, mage.cards.f.Frogmite.class));
        cards.add(new SetCardInfo("Fulminator Mage", 193, Rarity.RARE, mage.cards.f.FulminatorMage.class));
        cards.add(new SetCardInfo("Ghost Council of Orzhova", 176, Rarity.RARE, mage.cards.g.GhostCouncilOfOrzhova.class));
        cards.add(new SetCardInfo("Ghostly Changeling", 83, Rarity.COMMON, mage.cards.g.GhostlyChangeling.class));
        cards.add(new SetCardInfo("Glassdust Hulk", 177, Rarity.UNCOMMON, mage.cards.g.GlassdustHulk.class));
        cards.add(new SetCardInfo("Glint Hawk Idol", 216, Rarity.COMMON, mage.cards.g.GlintHawkIdol.class));
        cards.add(new SetCardInfo("Gnarlid Pack", 144, Rarity.COMMON, mage.cards.g.GnarlidPack.class));
        cards.add(new SetCardInfo("Goblin Fireslinger", 114, Rarity.COMMON, mage.cards.g.GoblinFireslinger.class));
        cards.add(new SetCardInfo("Goblin War Paint", 115, Rarity.COMMON, mage.cards.g.GoblinWarPaint.class));
        cards.add(new SetCardInfo("Golgari Rot Farm", 243, Rarity.UNCOMMON, mage.cards.g.GolgariRotFarm.class));
        cards.add(new SetCardInfo("Gorehorn Minotaurs", 116, Rarity.COMMON, mage.cards.g.GorehornMinotaurs.class));
        cards.add(new SetCardInfo("Grim Affliction", 84, Rarity.COMMON, mage.cards.g.GrimAffliction.class));
        cards.add(new SetCardInfo("Gruul Turf", 244, Rarity.UNCOMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Guile", 46, Rarity.RARE, mage.cards.g.Guile.class));
        cards.add(new SetCardInfo("Gust-Skimmer", 217, Rarity.COMMON, mage.cards.g.GustSkimmer.class));
        cards.add(new SetCardInfo("Gut Shot", 117, Rarity.COMMON, mage.cards.g.GutShot.class));
        cards.add(new SetCardInfo("Hearthfire Hobgoblin", 194, Rarity.UNCOMMON, mage.cards.h.HearthfireHobgoblin.class));
        cards.add(new SetCardInfo("Helium Squirter", 47, Rarity.COMMON, mage.cards.h.HeliumSquirter.class));
        cards.add(new SetCardInfo("Hellkite Charger", 118, Rarity.RARE, mage.cards.h.HellkiteCharger.class));
        cards.add(new SetCardInfo("Hikari, Twilight Guardian", 18, Rarity.UNCOMMON, mage.cards.h.HikariTwilightGuardian.class));
        cards.add(new SetCardInfo("Horde of Notions", 178, Rarity.RARE, mage.cards.h.HordeOfNotions.class));
        cards.add(new SetCardInfo("Hurkyl's Recall", 48, Rarity.RARE, mage.cards.h.HurkylsRecall.class));
        cards.add(new SetCardInfo("Incandescent Soulstoke", 119, Rarity.UNCOMMON, mage.cards.i.IncandescentSoulstoke.class));
        cards.add(new SetCardInfo("Indomitable Archangel", 19, Rarity.RARE, mage.cards.i.IndomitableArchangel.class));
        cards.add(new SetCardInfo("Inexorable Tide", 49, Rarity.RARE, mage.cards.i.InexorableTide.class));
        cards.add(new SetCardInfo("Inner-Flame Igniter", 120, Rarity.COMMON, mage.cards.i.InnerFlameIgniter.class));
        cards.add(new SetCardInfo("Instill Infection", 85, Rarity.COMMON, mage.cards.i.InstillInfection.class));
        cards.add(new SetCardInfo("Iona, Shield of Emeria", 20, Rarity.MYTHIC, mage.cards.i.IonaShieldOfEmeria.class));
        cards.add(new SetCardInfo("Izzet Boilerworks", 245, Rarity.UNCOMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Kami of Ancient Law", 21, Rarity.COMMON, mage.cards.k.KamiOfAncientLaw.class));
        cards.add(new SetCardInfo("Karn Liberated", 4, Rarity.MYTHIC, mage.cards.k.KarnLiberated.class));
        cards.add(new SetCardInfo("Karplusan Strider", 145, Rarity.UNCOMMON, mage.cards.k.KarplusanStrider.class));
        cards.add(new SetCardInfo("Kavu Primarch", 146, Rarity.COMMON, mage.cards.k.KavuPrimarch.class));
        cards.add(new SetCardInfo("Kiki-Jiki, Mirror Breaker", 121, Rarity.MYTHIC, mage.cards.k.KikiJikiMirrorBreaker.class));
        cards.add(new SetCardInfo("Kitesail", 218, Rarity.COMMON, mage.cards.k.Kitesail.class));
        cards.add(new SetCardInfo("Kor Duelist", 22, Rarity.UNCOMMON, mage.cards.k.KorDuelist.class));
        cards.add(new SetCardInfo("Kozilek, Butcher of Truth", 5, Rarity.MYTHIC, mage.cards.k.KozilekButcherOfTruth.class));
        cards.add(new SetCardInfo("Kozilek's Predator", 147, Rarity.COMMON, mage.cards.k.KozileksPredator.class));
        cards.add(new SetCardInfo("Leyline of Sanctity", 23, Rarity.RARE, mage.cards.l.LeylineOfSanctity.class));
        cards.add(new SetCardInfo("Lightning Bolt", 122, Rarity.UNCOMMON, mage.cards.l.LightningBolt.class));
        cards.add(new SetCardInfo("Lodestone Golem", 219, Rarity.RARE, mage.cards.l.LodestoneGolem.class));
        cards.add(new SetCardInfo("Lodestone Myr", 220, Rarity.RARE, mage.cards.l.LodestoneMyr.class));
        cards.add(new SetCardInfo("Long-Forgotten Gohei", 221, Rarity.RARE, mage.cards.l.LongForgottenGohei.class));
        cards.add(new SetCardInfo("Lorescale Coatl", 179, Rarity.UNCOMMON, mage.cards.l.LorescaleCoatl.class));
        cards.add(new SetCardInfo("Mana Leak", 50, Rarity.COMMON, mage.cards.m.ManaLeak.class));
        cards.add(new SetCardInfo("Matca Rioters", 148, Rarity.COMMON, mage.cards.m.MatcaRioters.class));
        cards.add(new SetCardInfo("Midnight Banshee", 86, Rarity.RARE, mage.cards.m.MidnightBanshee.class));
        cards.add(new SetCardInfo("Mighty Leap", 24, Rarity.COMMON, mage.cards.m.MightyLeap.class));
        cards.add(new SetCardInfo("Mirran Crusader", 25, Rarity.RARE, mage.cards.m.MirranCrusader.class));
        cards.add(new SetCardInfo("Mirror Entity", 26, Rarity.RARE, mage.cards.m.MirrorEntity.class));
        cards.add(new SetCardInfo("Moonlit Strider", 27, Rarity.COMMON, mage.cards.m.MoonlitStrider.class));
        cards.add(new SetCardInfo("Mortarpod", 222, Rarity.UNCOMMON, mage.cards.m.Mortarpod.class));
        cards.add(new SetCardInfo("Mox Opal", 223, Rarity.MYTHIC, mage.cards.m.MoxOpal.class));
        cards.add(new SetCardInfo("Mulldrifter", 51, Rarity.UNCOMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Mutagenic Growth", 149, Rarity.UNCOMMON, mage.cards.m.MutagenicGrowth.class));
        cards.add(new SetCardInfo("Myr Enforcer", 224, Rarity.COMMON, mage.cards.m.MyrEnforcer.class));
        cards.add(new SetCardInfo("Myrsmith", 28, Rarity.UNCOMMON, mage.cards.m.Myrsmith.class));
        cards.add(new SetCardInfo("Mystic Snake", 180, Rarity.RARE, mage.cards.m.MysticSnake.class));
        cards.add(new SetCardInfo("Nameless Inversion", 87, Rarity.COMMON, mage.cards.n.NamelessInversion.class));
        cards.add(new SetCardInfo("Narcolepsy", 52, Rarity.COMMON, mage.cards.n.Narcolepsy.class));
        cards.add(new SetCardInfo("Necrogenesis", 181, Rarity.UNCOMMON, mage.cards.n.Necrogenesis.class));
        cards.add(new SetCardInfo("Necroskitter", 88, Rarity.RARE, mage.cards.n.Necroskitter.class));
        cards.add(new SetCardInfo("Nest Invader", 150, Rarity.COMMON, mage.cards.n.NestInvader.class));
        cards.add(new SetCardInfo("Niv-Mizzet, the Firemind", 182, Rarity.RARE, mage.cards.n.NivMizzetTheFiremind.class));
        cards.add(new SetCardInfo("Nobilis of War", 195, Rarity.RARE, mage.cards.n.NobilisOfWar.class));
        cards.add(new SetCardInfo("Noble Hierarch", 151, Rarity.RARE, mage.cards.n.NobleHierarch.class));
        cards.add(new SetCardInfo("Novijen Sages", 53, Rarity.UNCOMMON, mage.cards.n.NovijenSages.class));
        cards.add(new SetCardInfo("Oblivion Ring", 29, Rarity.UNCOMMON, mage.cards.o.OblivionRing.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 246, Rarity.UNCOMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Otherworldly Journey", 30, Rarity.COMMON, mage.cards.o.OtherworldlyJourney.class));
        cards.add(new SetCardInfo("Overwhelm", 152, Rarity.UNCOMMON, mage.cards.o.Overwhelm.class));
        cards.add(new SetCardInfo("Overwhelming Stampede", 153, Rarity.RARE, mage.cards.o.OverwhelmingStampede.class));
        cards.add(new SetCardInfo("Pelakka Wurm", 154, Rarity.UNCOMMON, mage.cards.p.PelakkaWurm.class));
        cards.add(new SetCardInfo("Pillory of the Sleepless", 183, Rarity.UNCOMMON, mage.cards.p.PilloryOfTheSleepless.class));
        cards.add(new SetCardInfo("Plagued Rusalka", 89, Rarity.COMMON, mage.cards.p.PlaguedRusalka.class));
        cards.add(new SetCardInfo("Plaxcaster Frogling", 184, Rarity.UNCOMMON, mage.cards.p.PlaxcasterFrogling.class));
        cards.add(new SetCardInfo("Plummet", 155, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Precursor Golem", 225, Rarity.RARE, mage.cards.p.PrecursorGolem.class));
        cards.add(new SetCardInfo("Primeval Titan", 156, Rarity.MYTHIC, mage.cards.p.PrimevalTitan.class));
        cards.add(new SetCardInfo("Profane Command", 90, Rarity.RARE, mage.cards.p.ProfaneCommand.class));
        cards.add(new SetCardInfo("Puppeteer Clique", 91, Rarity.RARE, mage.cards.p.PuppeteerClique.class));
        cards.add(new SetCardInfo("Qumulox", 54, Rarity.UNCOMMON, mage.cards.q.Qumulox.class));
        cards.add(new SetCardInfo("Raise the Alarm", 31, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Rakdos Carnarium", 247, Rarity.UNCOMMON, mage.cards.r.RakdosCarnarium.class));
        cards.add(new SetCardInfo("Rampant Growth", 157, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Reassembling Skeleton", 92, Rarity.UNCOMMON, mage.cards.r.ReassemblingSkeleton.class));
        cards.add(new SetCardInfo("Remand", 55, Rarity.UNCOMMON, mage.cards.r.Remand.class));
        cards.add(new SetCardInfo("Repeal", 56, Rarity.COMMON, mage.cards.r.Repeal.class));
        cards.add(new SetCardInfo("Restless Apparition", 196, Rarity.UNCOMMON, mage.cards.r.RestlessApparition.class));
        cards.add(new SetCardInfo("Root-Kin Ally", 158, Rarity.UNCOMMON, mage.cards.r.RootKinAlly.class));
        cards.add(new SetCardInfo("Runed Servitor", 226, Rarity.COMMON, mage.cards.r.RunedServitor.class));
        cards.add(new SetCardInfo("Rusted Relic", 227, Rarity.COMMON, mage.cards.r.RustedRelic.class));
        cards.add(new SetCardInfo("Savage Twister", 185, Rarity.UNCOMMON, mage.cards.s.SavageTwister.class));
        cards.add(new SetCardInfo("Scatter the Seeds", 159, Rarity.COMMON, mage.cards.s.ScatterTheSeeds.class));
        cards.add(new SetCardInfo("Scavenger Drake", 93, Rarity.UNCOMMON, mage.cards.s.ScavengerDrake.class));
        cards.add(new SetCardInfo("Scion of the Wild", 160, Rarity.COMMON, mage.cards.s.ScionOfTheWild.class));
        cards.add(new SetCardInfo("Scute Mob", 161, Rarity.RARE, mage.cards.s.ScuteMob.class));
        cards.add(new SetCardInfo("Scuttling Death", 94, Rarity.COMMON, mage.cards.s.ScuttlingDeath.class));
        cards.add(new SetCardInfo("Selesnya Guildmage", 197, Rarity.UNCOMMON, mage.cards.s.SelesnyaGuildmage.class));
        cards.add(new SetCardInfo("Selesnya Sanctuary", 248, Rarity.UNCOMMON, mage.cards.s.SelesnyaSanctuary.class));
        cards.add(new SetCardInfo("Shadowmage Infiltrator", 186, Rarity.RARE, mage.cards.s.ShadowmageInfiltrator.class));
        cards.add(new SetCardInfo("Shrewd Hatchling", 198, Rarity.UNCOMMON, mage.cards.s.ShrewdHatchling.class));
        cards.add(new SetCardInfo("Shrivel", 95, Rarity.COMMON, mage.cards.s.Shrivel.class));
        cards.add(new SetCardInfo("Sickle Ripper", 96, Rarity.COMMON, mage.cards.s.SickleRipper.class));
        cards.add(new SetCardInfo("Sickleslicer", 228, Rarity.COMMON, mage.cards.s.Sickleslicer.class));
        cards.add(new SetCardInfo("Sigil Blessing", 187, Rarity.UNCOMMON, mage.cards.s.SigilBlessing.class));
        cards.add(new SetCardInfo("Sign in Blood", 97, Rarity.COMMON, mage.cards.s.SignInBlood.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 249, Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Initiate", 162, Rarity.COMMON, mage.cards.s.SimicInitiate.class));
        cards.add(new SetCardInfo("Skarrgan Firebird", 123, Rarity.UNCOMMON, mage.cards.s.SkarrganFirebird.class));
        cards.add(new SetCardInfo("Skyhunter Skirmisher", 32, Rarity.COMMON, mage.cards.s.SkyhunterSkirmisher.class));
        cards.add(new SetCardInfo("Skyreach Manta", 229, Rarity.COMMON, mage.cards.s.SkyreachManta.class));
        cards.add(new SetCardInfo("Smash to Smithereens", 124, Rarity.COMMON, mage.cards.s.SmashToSmithereens.class));
        cards.add(new SetCardInfo("Smokebraider", 125, Rarity.COMMON, mage.cards.s.Smokebraider.class));
        cards.add(new SetCardInfo("Somber Hoverguard", 57, Rarity.COMMON, mage.cards.s.SomberHoverguard.class));
        cards.add(new SetCardInfo("Soulbright Flamekin", 126, Rarity.COMMON, mage.cards.s.SoulbrightFlamekin.class));
        cards.add(new SetCardInfo("Spectral Procession", 33, Rarity.UNCOMMON, mage.cards.s.SpectralProcession.class));
        cards.add(new SetCardInfo("Spellskite", 230, Rarity.RARE, mage.cards.s.Spellskite.class));
        cards.add(new SetCardInfo("Sphere of the Suns", 231, Rarity.COMMON, mage.cards.s.SphereOfTheSuns.class));
        cards.add(new SetCardInfo("Spikeshot Elder", 127, Rarity.RARE, mage.cards.s.SpikeshotElder.class));
        cards.add(new SetCardInfo("Spitebellows", 128, Rarity.UNCOMMON, mage.cards.s.Spitebellows.class));
        cards.add(new SetCardInfo("Splinter Twin", 129, Rarity.RARE, mage.cards.s.SplinterTwin.class));
        cards.add(new SetCardInfo("Spread the Sickness", 98, Rarity.UNCOMMON, mage.cards.s.SpreadTheSickness.class));
        cards.add(new SetCardInfo("Steady Progress", 58, Rarity.COMMON, mage.cards.s.SteadyProgress.class));
        cards.add(new SetCardInfo("Stoic Rebuttal", 59, Rarity.COMMON, mage.cards.s.StoicRebuttal.class));
        cards.add(new SetCardInfo("Stormblood Berserker", 130, Rarity.UNCOMMON, mage.cards.s.StormbloodBerserker.class));
        cards.add(new SetCardInfo("Sundering Vitae", 163, Rarity.COMMON, mage.cards.s.SunderingVitae.class));
        cards.add(new SetCardInfo("Sunforger", 232, Rarity.RARE, mage.cards.s.Sunforger.class));
        cards.add(new SetCardInfo("Sunlance", 34, Rarity.COMMON, mage.cards.s.Sunlance.class));
        cards.add(new SetCardInfo("Sunspear Shikari", 35, Rarity.COMMON, mage.cards.s.SunspearShikari.class));
        cards.add(new SetCardInfo("Surgical Extraction", 99, Rarity.RARE, mage.cards.s.SurgicalExtraction.class));
        cards.add(new SetCardInfo("Surrakar Spellblade", 60, Rarity.RARE, mage.cards.s.SurrakarSpellblade.class));
        cards.add(new SetCardInfo("Swans of Bryn Argoll", 199, Rarity.RARE, mage.cards.s.SwansOfBrynArgoll.class));
        cards.add(new SetCardInfo("Sylvan Bounty", 164, Rarity.COMMON, mage.cards.s.SylvanBounty.class));
        cards.add(new SetCardInfo("Taj-Nar Swordsmith", 36, Rarity.UNCOMMON, mage.cards.t.TajNarSwordsmith.class));
        cards.add(new SetCardInfo("Tarmogoyf", 165, Rarity.MYTHIC, mage.cards.t.Tarmogoyf.class));
        cards.add(new SetCardInfo("Telling Time", 61, Rarity.UNCOMMON, mage.cards.t.TellingTime.class));
        cards.add(new SetCardInfo("Terashi's Grasp", 37, Rarity.COMMON, mage.cards.t.TerashisGrasp.class));
        cards.add(new SetCardInfo("Tezzeret's Gambit", 63, Rarity.UNCOMMON, mage.cards.t.TezzeretsGambit.class));
        cards.add(new SetCardInfo("Tezzeret the Seeker", 62, Rarity.MYTHIC, mage.cards.t.TezzeretTheSeeker.class));
        cards.add(new SetCardInfo("Thief of Hope", 100, Rarity.COMMON, mage.cards.t.ThiefOfHope.class));
        cards.add(new SetCardInfo("Thoughtcast", 64, Rarity.COMMON, mage.cards.t.Thoughtcast.class));
        cards.add(new SetCardInfo("Thrive", 166, Rarity.COMMON, mage.cards.t.Thrive.class));
        cards.add(new SetCardInfo("Thrummingbird", 65, Rarity.COMMON, mage.cards.t.Thrummingbird.class));
        cards.add(new SetCardInfo("Thunderblust", 131, Rarity.RARE, mage.cards.t.Thunderblust.class));
        cards.add(new SetCardInfo("Tribal Flames", 132, Rarity.COMMON, mage.cards.t.TribalFlames.class));
        cards.add(new SetCardInfo("Tukatongue Thallid", 167, Rarity.COMMON, mage.cards.t.TukatongueThallid.class));
        cards.add(new SetCardInfo("Tumble Magnet", 233, Rarity.UNCOMMON, mage.cards.t.TumbleMagnet.class));
        cards.add(new SetCardInfo("Ulamog's Crusher", 7, Rarity.COMMON, mage.cards.u.UlamogsCrusher.class));
        cards.add(new SetCardInfo("Ulamog, the Infinite Gyre", 6, Rarity.MYTHIC, mage.cards.u.UlamogTheInfiniteGyre.class));
        cards.add(new SetCardInfo("Vampire Lacerator", 101, Rarity.COMMON, mage.cards.v.VampireLacerator.class));
        cards.add(new SetCardInfo("Vampire Outcasts", 102, Rarity.UNCOMMON, mage.cards.v.VampireOutcasts.class));
        cards.add(new SetCardInfo("Vapor Snag", 66, Rarity.COMMON, mage.cards.v.VaporSnag.class));
        cards.add(new SetCardInfo("Vendilion Clique", 67, Rarity.MYTHIC, mage.cards.v.VendilionClique.class));
        cards.add(new SetCardInfo("Vengeful Rebirth", 188, Rarity.UNCOMMON, mage.cards.v.VengefulRebirth.class));
        cards.add(new SetCardInfo("Viashino Slaughtermaster", 133, Rarity.COMMON, mage.cards.v.ViashinoSlaughtermaster.class));
        cards.add(new SetCardInfo("Vigean Graftmage", 68, Rarity.COMMON, mage.cards.v.VigeanGraftmage.class));
        cards.add(new SetCardInfo("Vines of Vastwood", 168, Rarity.COMMON, mage.cards.v.VinesOfVastwood.class));
        cards.add(new SetCardInfo("Waking Nightmare", 103, Rarity.COMMON, mage.cards.w.WakingNightmare.class));
        cards.add(new SetCardInfo("Water Servant", 69, Rarity.UNCOMMON, mage.cards.w.WaterServant.class));
        cards.add(new SetCardInfo("Waxmane Baku", 38, Rarity.COMMON, mage.cards.w.WaxmaneBaku.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 234, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Wildfire", 134, Rarity.RARE, mage.cards.w.Wildfire.class));
        cards.add(new SetCardInfo("Wilt-Leaf Liege", 200, Rarity.RARE, mage.cards.w.WiltLeafLiege.class));
        cards.add(new SetCardInfo("Wings of Velis Vel", 70, Rarity.COMMON, mage.cards.w.WingsOfVelisVel.class));
        cards.add(new SetCardInfo("Wolfbriar Elemental", 169, Rarity.RARE, mage.cards.w.WolfbriarElemental.class));
        cards.add(new SetCardInfo("Worldheart Phoenix", 135, Rarity.UNCOMMON, mage.cards.w.WorldheartPhoenix.class));
        cards.add(new SetCardInfo("Wrap in Flames", 136, Rarity.COMMON, mage.cards.w.WrapInFlames.class));
        cards.add(new SetCardInfo("Wrecking Ball", 189, Rarity.UNCOMMON, mage.cards.w.WreckingBall.class));
    }

}
