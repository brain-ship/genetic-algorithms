package com.tkutz.ai.tsp.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.tkutz.ai.tsp.City;
import com.tkutz.ai.tsp.TSP;

public class TSPSampleInitializer {

	@SuppressWarnings("serial")
	private final static List<City> att48 = new ArrayList<City>() {
		{
			add(new City(6734, 1453));
			add(new City(2233, 10));
			add(new City(5530, 1424));
			add(new City(401, 841));
			add(new City(3082, 1644));
			add(new City(7608, 4458));
			add(new City(7573, 3716));
			add(new City(7265, 1268));
			add(new City(6898, 1885));
			add(new City(1112, 2049));
			add(new City(5468, 2606));
			add(new City(5989, 2873));
			add(new City(4706, 2674));
			add(new City(4612, 2035));
			add(new City(6347, 2683));
			add(new City(6107, 669));
			add(new City(7611, 5184));
			add(new City(7462, 3590));
			add(new City(7732, 4723));
			add(new City(5900, 3561));
			add(new City(4483, 3369));
			add(new City(6101, 1110));
			add(new City(5199, 2182));
			add(new City(1633, 2809));
			add(new City(4307, 2322));
			add(new City(675, 1006));
			add(new City(7555, 4819));
			add(new City(7541, 3981));
			add(new City(3177, 756));
			add(new City(7352, 4506));
			add(new City(7545, 2801));
			add(new City(3245, 3305));
			add(new City(6426, 3173));
			add(new City(4608, 1198));
			add(new City(23, 2216));
			add(new City(7248, 3779));
			add(new City(7762, 4595));
			add(new City(7392, 2244));
			add(new City(3484, 2829));
			add(new City(6271, 2135));
			add(new City(4985, 140));
			add(new City(1916, 1569));
			add(new City(7280, 4899));
			add(new City(7509, 3239));
			add(new City(10, 2676));
			add(new City(6807, 2993));
			add(new City(5185, 3258));
			add(new City(3023, 1942));
		}
	};
	@SuppressWarnings("serial")
	private final static List<City> att48_solution = new ArrayList<City>() {
		{
			// indices copied from official att48.opt.tour file, but they start
			// with 1, so -1 needed
			add(att48.get(1 - 1));
			add(att48.get(8 - 1));
			add(att48.get(38 - 1));
			add(att48.get(31 - 1));
			add(att48.get(44 - 1));
			add(att48.get(18 - 1));
			add(att48.get(7 - 1));
			add(att48.get(28 - 1));
			add(att48.get(6 - 1));
			add(att48.get(37 - 1));
			add(att48.get(19 - 1));
			add(att48.get(27 - 1));
			add(att48.get(17 - 1));
			add(att48.get(43 - 1));
			add(att48.get(30 - 1));
			add(att48.get(36 - 1));
			add(att48.get(46 - 1));
			add(att48.get(33 - 1));
			add(att48.get(20 - 1));
			add(att48.get(47 - 1));
			add(att48.get(21 - 1));
			add(att48.get(32 - 1));
			add(att48.get(39 - 1));
			add(att48.get(48 - 1));
			add(att48.get(5 - 1));
			add(att48.get(42 - 1));
			add(att48.get(24 - 1));
			add(att48.get(10 - 1));
			add(att48.get(45 - 1));
			add(att48.get(35 - 1));
			add(att48.get(4 - 1));
			add(att48.get(26 - 1));
			add(att48.get(2 - 1));
			add(att48.get(29 - 1));
			add(att48.get(34 - 1));
			add(att48.get(41 - 1));
			add(att48.get(16 - 1));
			add(att48.get(22 - 1));
			add(att48.get(3 - 1));
			add(att48.get(23 - 1));
			add(att48.get(14 - 1));
			add(att48.get(25 - 1));
			add(att48.get(13 - 1));
			add(att48.get(11 - 1));
			add(att48.get(12 - 1));
			add(att48.get(15 - 1));
			add(att48.get(40 - 1));
			add(att48.get(9 - 1));
		}
	};

	@SuppressWarnings("serial")
	private static final List<City> kroD100 = new ArrayList<City>() {
		{
			add(new City(2995, 264));
			add(new City(202, 233));
			add(new City(981, 848));
			add(new City(1346, 408));
			add(new City(781, 670));
			add(new City(1009, 1001));
			add(new City(2927, 1777));
			add(new City(2982, 949));
			add(new City(555, 1121));
			add(new City(464, 1302));
			add(new City(3452, 637));
			add(new City(571, 1982));
			add(new City(2656, 128));
			add(new City(1623, 1723));
			add(new City(2067, 694));
			add(new City(1725, 927));
			add(new City(3600, 459));
			add(new City(1109, 1196));
			add(new City(366, 339));
			add(new City(778, 1282));
			add(new City(386, 1616));
			add(new City(3918, 1217));
			add(new City(3332, 1049));
			add(new City(2597, 349));
			add(new City(811, 1295));
			add(new City(241, 1069));
			add(new City(2658, 360));
			add(new City(394, 1944));
			add(new City(3786, 1862));
			add(new City(264, 36));
			add(new City(2050, 1833));
			add(new City(3538, 125));
			add(new City(1646, 1817));
			add(new City(2993, 624));
			add(new City(547, 25));
			add(new City(3373, 1902));
			add(new City(460, 267));
			add(new City(3060, 781));
			add(new City(1828, 456));
			add(new City(1021, 962));
			add(new City(2347, 388));
			add(new City(3535, 1112));
			add(new City(1529, 581));
			add(new City(1203, 385));
			add(new City(1787, 1902));
			add(new City(2740, 1101));
			add(new City(555, 1753));
			add(new City(47, 363));
			add(new City(3935, 540));
			add(new City(3062, 329));
			add(new City(387, 199));
			add(new City(2901, 920));
			add(new City(931, 512));
			add(new City(1766, 692));
			add(new City(401, 980));
			add(new City(149, 1629));
			add(new City(2214, 1977));
			add(new City(3805, 1619));
			add(new City(1179, 969));
			add(new City(1017, 333));
			add(new City(2834, 1512));
			add(new City(634, 294));
			add(new City(1819, 814));
			add(new City(1393, 859));
			add(new City(1768, 1578));
			add(new City(3023, 871));
			add(new City(3248, 1906));
			add(new City(1632, 1742));
			add(new City(2223, 990));
			add(new City(3868, 697));
			add(new City(1541, 354));
			add(new City(2374, 1944));
			add(new City(1962, 389));
			add(new City(3007, 1524));
			add(new City(3220, 1945));
			add(new City(2356, 1568));
			add(new City(1604, 706));
			add(new City(2028, 1736));
			add(new City(2581, 121));
			add(new City(2221, 1578));
			add(new City(2944, 632));
			add(new City(1082, 1561));
			add(new City(997, 942));
			add(new City(2334, 523));
			add(new City(1264, 1090));
			add(new City(1699, 1294));
			add(new City(235, 1059));
			add(new City(2592, 248));
			add(new City(3642, 699));
			add(new City(3599, 514));
			add(new City(1766, 678));
			add(new City(240, 619));
			add(new City(1272, 246));
			add(new City(3503, 301));
			add(new City(80, 1533));
			add(new City(1677, 1238));
			add(new City(3766, 154));
			add(new City(3946, 459));
			add(new City(1994, 1852));
			add(new City(278, 165));

		}
	};
	@SuppressWarnings("serial")
	private static final List<City> kroD100_solution = new ArrayList<City>() {
		{
			add(kroD100.get(1 - 1));
			add(kroD100.get(50 - 1));
			add(kroD100.get(34 - 1));
			add(kroD100.get(81 - 1));
			add(kroD100.get(38 - 1));
			add(kroD100.get(66 - 1));
			add(kroD100.get(8 - 1));
			add(kroD100.get(52 - 1));
			add(kroD100.get(46 - 1));
			add(kroD100.get(23 - 1));
			add(kroD100.get(42 - 1));
			add(kroD100.get(89 - 1));
			add(kroD100.get(11 - 1));
			add(kroD100.get(90 - 1));
			add(kroD100.get(17 - 1));
			add(kroD100.get(94 - 1));
			add(kroD100.get(32 - 1));
			add(kroD100.get(97 - 1));
			add(kroD100.get(98 - 1));
			add(kroD100.get(49 - 1));
			add(kroD100.get(70 - 1));
			add(kroD100.get(22 - 1));
			add(kroD100.get(58 - 1));
			add(kroD100.get(29 - 1));
			add(kroD100.get(36 - 1));
			add(kroD100.get(67 - 1));
			add(kroD100.get(75 - 1));
			add(kroD100.get(7 - 1));
			add(kroD100.get(74 - 1));
			add(kroD100.get(61 - 1));
			add(kroD100.get(76 - 1));
			add(kroD100.get(80 - 1));
			add(kroD100.get(72 - 1));
			add(kroD100.get(57 - 1));
			add(kroD100.get(31 - 1));
			add(kroD100.get(78 - 1));
			add(kroD100.get(99 - 1));
			add(kroD100.get(45 - 1));
			add(kroD100.get(33 - 1));
			add(kroD100.get(68 - 1));
			add(kroD100.get(14 - 1));
			add(kroD100.get(65 - 1));
			add(kroD100.get(86 - 1));
			add(kroD100.get(96 - 1));
			add(kroD100.get(16 - 1));
			add(kroD100.get(63 - 1));
			add(kroD100.get(54 - 1));
			add(kroD100.get(91 - 1));
			add(kroD100.get(77 - 1));
			add(kroD100.get(43 - 1));
			add(kroD100.get(64 - 1));
			add(kroD100.get(85 - 1));
			add(kroD100.get(59 - 1));
			add(kroD100.get(3 - 1));
			add(kroD100.get(83 - 1));
			add(kroD100.get(40 - 1));
			add(kroD100.get(6 - 1));
			add(kroD100.get(18 - 1));
			add(kroD100.get(82 - 1));
			add(kroD100.get(25 - 1));
			add(kroD100.get(20 - 1));
			add(kroD100.get(9 - 1));
			add(kroD100.get(10 - 1));
			add(kroD100.get(21 - 1));
			add(kroD100.get(47 - 1));
			add(kroD100.get(12 - 1));
			add(kroD100.get(28 - 1));
			add(kroD100.get(56 - 1));
			add(kroD100.get(95 - 1));
			add(kroD100.get(26 - 1));
			add(kroD100.get(87 - 1));
			add(kroD100.get(55 - 1));
			add(kroD100.get(92 - 1));
			add(kroD100.get(48 - 1));
			add(kroD100.get(2 - 1));
			add(kroD100.get(100 - 1));
			add(kroD100.get(30 - 1));
			add(kroD100.get(35 - 1));
			add(kroD100.get(51 - 1));
			add(kroD100.get(19 - 1));
			add(kroD100.get(37 - 1));
			add(kroD100.get(62 - 1));
			add(kroD100.get(5 - 1));
			add(kroD100.get(53 - 1));
			add(kroD100.get(60 - 1));
			add(kroD100.get(44 - 1));
			add(kroD100.get(93 - 1));
			add(kroD100.get(4 - 1));
			add(kroD100.get(71 - 1));
			add(kroD100.get(39 - 1));
			add(kroD100.get(73 - 1));
			add(kroD100.get(15 - 1));
			add(kroD100.get(69 - 1));
			add(kroD100.get(84 - 1));
			add(kroD100.get(41 - 1));
			add(kroD100.get(24 - 1));
			add(kroD100.get(27 - 1));
			add(kroD100.get(88 - 1));
			add(kroD100.get(79 - 1));
			add(kroD100.get(13 - 1));

		}
	};

	@SuppressWarnings("serial")
	private static final List<City> pr76 = new ArrayList<City>() {
		{
			add(new City(3600, 2300));
			add(new City(3100, 3300));
			add(new City(4700, 5750));
			add(new City(5400, 5750));
			add(new City(5608, 7103));
			add(new City(4493, 7102));
			add(new City(3600, 6950));
			add(new City(3100, 7250));
			add(new City(4700, 8450));
			add(new City(5400, 8450));
			add(new City(5610, 10053));
			add(new City(4492, 10052));
			add(new City(3600, 10800));
			add(new City(3100, 10950));
			add(new City(4700, 11650));
			add(new City(5400, 11650));
			add(new City(6650, 10800));
			add(new City(7300, 10950));
			add(new City(7300, 7250));
			add(new City(6650, 6950));
			add(new City(7300, 3300));
			add(new City(6650, 2300));
			add(new City(5400, 1600));
			add(new City(8350, 2300));
			add(new City(7850, 3300));
			add(new City(9450, 5750));
			add(new City(10150, 5750));
			add(new City(10358, 7103));
			add(new City(9243, 7102));
			add(new City(8350, 6950));
			add(new City(7850, 7250));
			add(new City(9450, 8450));
			add(new City(10150, 8450));
			add(new City(10360, 10053));
			add(new City(9242, 10052));
			add(new City(8350, 10800));
			add(new City(7850, 10950));
			add(new City(9450, 11650));
			add(new City(10150, 11650));
			add(new City(11400, 10800));
			add(new City(12050, 10950));
			add(new City(12050, 7250));
			add(new City(11400, 6950));
			add(new City(12050, 3300));
			add(new City(11400, 2300));
			add(new City(10150, 1600));
			add(new City(13100, 2300));
			add(new City(12600, 3300));
			add(new City(14200, 5750));
			add(new City(14900, 5750));
			add(new City(15108, 7103));
			add(new City(13993, 7102));
			add(new City(13100, 6950));
			add(new City(12600, 7250));
			add(new City(14200, 8450));
			add(new City(14900, 8450));
			add(new City(15110, 10053));
			add(new City(13992, 10052));
			add(new City(13100, 10800));
			add(new City(12600, 10950));
			add(new City(14200, 11650));
			add(new City(14900, 11650));
			add(new City(16150, 10800));
			add(new City(16800, 10950));
			add(new City(16800, 7250));
			add(new City(16150, 6950));
			add(new City(16800, 3300));
			add(new City(16150, 2300));
			add(new City(14900, 1600));
			add(new City(19800, 800));
			add(new City(19800, 10000));
			add(new City(19800, 11900));
			add(new City(19800, 12200));
			add(new City(200, 12200));
			add(new City(200, 1100));
			add(new City(200, 800));
		}
	};
	
	@SuppressWarnings("serial")
	private static final List<City> pr76_solution = new ArrayList<City>() {
		{
			add(pr76.get(1 - 1));
			add(pr76.get(76 - 1));
			add(pr76.get(75 - 1));
			add(pr76.get(2 - 1));
			add(pr76.get(3 - 1));
			add(pr76.get(4 - 1));
			add(pr76.get(5 - 1));
			add(pr76.get(6 - 1));
			add(pr76.get(7 - 1));
			add(pr76.get(8 - 1));
			add(pr76.get(9 - 1));
			add(pr76.get(10 - 1));
			add(pr76.get(11 - 1));
			add(pr76.get(12 - 1));
			add(pr76.get(13 - 1));
			add(pr76.get(14 - 1));
			add(pr76.get(74 - 1));
			add(pr76.get(15 - 1));
			add(pr76.get(16 - 1));
			add(pr76.get(17 - 1));
			add(pr76.get(18 - 1));
			add(pr76.get(37 - 1));
			add(pr76.get(36 - 1));
			add(pr76.get(38 - 1));
			add(pr76.get(39 - 1));
			add(pr76.get(40 - 1));
			add(pr76.get(34 - 1));
			add(pr76.get(35 - 1));
			add(pr76.get(33 - 1));
			add(pr76.get(32 - 1));
			add(pr76.get(29 - 1));
			add(pr76.get(30 - 1));
			add(pr76.get(31 - 1));
			add(pr76.get(19 - 1));
			add(pr76.get(20 - 1));
			add(pr76.get(26 - 1));
			add(pr76.get(27 - 1));
			add(pr76.get(28 - 1));
			add(pr76.get(43 - 1));
			add(pr76.get(42 - 1));
			add(pr76.get(54 - 1));
			add(pr76.get(53 - 1));
			add(pr76.get(52 - 1));
			add(pr76.get(55 - 1));
			add(pr76.get(56 - 1));
			add(pr76.get(57 - 1));
			add(pr76.get(58 - 1));
			add(pr76.get(59 - 1));
			add(pr76.get(60 - 1));
			add(pr76.get(41 - 1));
			add(pr76.get(61 - 1));
			add(pr76.get(62 - 1));
			add(pr76.get(63 - 1));
			add(pr76.get(64 - 1));
			add(pr76.get(73 - 1));
			add(pr76.get(72 - 1));
			add(pr76.get(71 - 1));
			add(pr76.get(65 - 1));
			add(pr76.get(66 - 1));
			add(pr76.get(51 - 1));
			add(pr76.get(49 - 1));
			add(pr76.get(50 - 1));
			add(pr76.get(67 - 1));
			add(pr76.get(70 - 1));
			add(pr76.get(68 - 1));
			add(pr76.get(69 - 1));
			add(pr76.get(47 - 1));
			add(pr76.get(48 - 1));
			add(pr76.get(44 - 1));
			add(pr76.get(45 - 1));
			add(pr76.get(46 - 1));
			add(pr76.get(24 - 1));
			add(pr76.get(25 - 1));
			add(pr76.get(21 - 1));
			add(pr76.get(22 - 1));
			add(pr76.get(23 - 1));
		}
	};

	public static void initAtt48() {
		TSP.create(new HashSet<City>(att48), att48_solution);
	}

	public static void initKroD100() {
		TSP.create(new HashSet<City>(kroD100), kroD100_solution);
	}
	
	public static void initPr76() {
		TSP.create(new HashSet<City>(pr76), pr76_solution);
	}
}
