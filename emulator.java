import java.io.*;
import java.util.*;
class emulator {
	public static void main(String [] args) throws Exception {
		if (args.length != 1) {
			System.out.println("bitch");
			System.exit(0x01);
		}
		FileInputStream in = new FileInputStream(args[0]);
		emulator machine = new emulator(in);
		while (1) {
			machine.cycle();
			System.out.print("\033[2J");
			System.out.println("current: "+machine.current());
			System.out.println("next: "+machine.next());
			System.out.println("instruction: "+machine.inst()+"\n");
			System.out.println("addr: "+machine.addr());
			System.out.println("register: "+machine.reg());
			System.out.println("direction: "+machine.dir());
			System.out.println("out reg: "+machine.outreg());
			System.out.println("output: "+machine.output());
		}
	}
	private static short ram[];
	private static byte inst[][];
	emulator(FileInputStream in) throws Exception {
		ram = new short[0x10000];
		inst = new byte[0x10000][5];
		while (1) {

	}
