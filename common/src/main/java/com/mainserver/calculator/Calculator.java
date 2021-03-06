package com.mainserver.calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    int sum(int a, int b) throws RemoteException;

    int multiply(int a, int b) throws RemoteException;

}