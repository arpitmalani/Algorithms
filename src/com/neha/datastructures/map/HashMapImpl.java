package com.neha.datastructures.map;

public class HashMapImpl {
	
	class HashMap{
		int SIZE_OF_TABLE = 128;
		HashMapEntry[] table;
		
		public HashMap( int load){
			SIZE_OF_TABLE=load;
			table=new HashMapEntry[load];
			
			for(int i=0;i<load;i++){
				table[i]=null;
			}
		}
		
		public HashMap(){
			this(128);
		}
		
		public int get(int key){
			int index=hashCodeIndex(key);
			if(table[index] == null){
				return -1;
			}else{
				HashMapEntry runner = table[index];
				if(runner.key==key){
					return runner.value;
				}
				while(runner.next !=null){
					if(runner.key==key){
						return runner.value;
					}
					
				}
				return -1;
			}
		}
		

		public void put(int key, int value){
			int index = hashCodeIndex(key);
			HashMapEntry hm = new HashMapEntry(key, value);
			if(table[index]==null){
				table[index]=hm;
			}else{
				HashMapEntry runner = table[index];
				while(runner.next!=null){
					if(runner.getKey()==key){
						runner.value=hm.value;
						break;
					}
				}
				if(runner.next==null){
					if(runner.key==key){
						runner.value=hm.value;
					}else{
						runner.next=hm;
					}
				}
			}
		}
		public int hashCodeIndex(int key){
			int hash = key*7*3/13;
			return hash%SIZE_OF_TABLE;
		}
		
	}
	
	private class HashMapEntry{
		int key;
		int value;
		HashMapEntry next=null;
		
		
		HashMapEntry(int key, int value){
			this.key=key;
			this.value=value;
		}
		
		public int getKey(){
			return this.key;
		}
		
		public int getValue(){
			return this.value;
		}
	}
	
	public static void main(String[] args) {
		HashMapImpl mapI = new HashMapImpl();
		HashMap map = mapI.new HashMap(128);
		
		map.put(1, 2);
		map.put(1, 3);
		System.out.println(map.get(1));
		
	}

}
