package com.xyh;

import java.util.LinkedList;

public class HashTable {
    // put(k, v)
    // get(k): v
    // remove(k)
    // k: int
    // v: string
    // Collisions: chaining
    // LinkedList[Entry]
    // Entry
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).add(new Entry(key, value));
//        int index = hash(key);
//        if (entries[index] == null) {
//            entries[index] = new LinkedList<>();
//        }
//
//        var bucket = entries[index];
//
//        for (var entry : bucket) {
//            if (entry.key == key) {
//                entry.value = value;
//                return;
//            }
//        }
//
//        bucket.addLast(new Entry(key, value));
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null) entries[index] = new LinkedList<>();
        return bucket;
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
//        var index = hash(key);
//        var bucket = entries[index];
//
//        if (bucket != null) {
//            for (var entry: bucket) {
//                if (entry.key == key) {
//                    return entry.value;
//                }
//            }
//        }
//
//        return null;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null) throw new IllegalStateException();

        getBucket(key).remove();

//        var index = hash(key);
//
//        var bucket = entries[index];
//
//        if (bucket == null) throw new IllegalStateException();
//
//        for (var entry: bucket){
//            if (entry.key == key) {
//                bucket.remove(entry);
//                return;
//            }
//        }
//
//        throw new IllegalStateException();
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) return entry;
            }
        }
        return null;
    }

}
