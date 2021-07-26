# Introduction
## 作为自己的一个md文件收集之地

## ��??
��??? RIP??? ?????  
<R4>system-view
[]ospf
[ospf-1]area 0
[]q
[]dis th
[]q
[]int  lo0
[]ospf enable  1(?????) area 0
[]int S2/0/0
[]ospf enable area 0 // ?????OSPF��?? ????,???????????
[]dis th
<R1>sys
[]ospf
[]area 0
[]q
[]dis  th
[]q
[]int lo0
[]ospf enable 1 area 0
[]int  s2/0/0
[]ospf enable area 0
[]int g0/0/0
[]ospf enable area 0

R2 R3 ??? 

[R1]dis ospf peer (brief)
[R1]dis ospf interface 

[R2]dis ospf peer (brief)
[R2 ]dis ospf interface 
[]dis ip routing-table

zuoye:
?????RIPv2
R1 R4????????????��??
R4???10.0.2.0/24??��????????15 

dis ospf lsdb //???????
dis ospf routing
cost?????? ??????????? 
???
224.0.0.5 ~ allspf router
224.0.0.6 ~ allddr router
[R2]undo lo0

DR?????
R2 R3
system-view
int g0/0/0
ospf dr-priority
dis ospf int g0/0/0
bandwidth-reference??????????��?? 

# ??????
AR1  
The device is running!

<R1\>dis ip routing-table  
```
Route Flags: R - relay, D - download to fib
------------------------------------------------------------------------------
Routing Tables: Public
         Destinations : 16       Routes : 16       

Destination/Mask    Proto   Pre  Cost      Flags NextHop         Interface

       10.0.1.0/24  Direct  0    0           D   10.0.1.1        LoopBack0
       10.0.1.1/32  Direct  0    0           D   127.0.0.1       LoopBack0
     10.0.1.255/32  Direct  0    0           D   127.0.0.1       LoopBack0
       10.0.2.0/24  RIP     100  1           D   10.0.123.2      GigabitEthernet 0/0/0
       10.0.3.0/24  RIP     100  1           D   10.0.123.3      GigabitEthernet 0/0/0
      10.0.14.0/24  Direct  0    0           D   10.0.14.1       Serial2/0/0
      10.0.14.1/32  Direct  0    0           D   127.0.0.1       Serial2/0/0
      10.0.14.4/32  Direct  0    0           D   10.0.14.4       Serial2/0/0
    10.0.14.255/32  Direct  0    0           D   127.0.0.1       Serial2/0/0
     10.0.123.0/24  Direct  0    0           D   10.0.123.1      GigabitEthernet 0/0/0
     10.0.123.1/32  Direct  0    0           D   127.0.0.1       GigabitEthernet 0/0/0
   10.0.123.255/32  Direct  0    0           D   127.0.0.1       GigabitEthernet 0/0/0
      127.0.0.0/8   Direct  0    0           D   127.0.0.1       InLoopBack0
      127.0.0.1/32  Direct  0    0           D   127.0.0.1       InLoopBack0
127.255.255.255/32  Direct  0    0           D   127.0.0.1       InLoopBack0
255.255.255.255/32  Direct  0    0           D   127.0.0.1       InLoopBack0
```
<R1\>sys  
```
Enter system view, return user view with Ctrl+Z.
```
[R1]ospf  
[R1-ospf-1]area 0  
[R1-ospf-1-area-0.0.0.0]q  
[R1-ospf-1]dis th  
```
[V200R003C00]
#
ospf 1 
 area 0.0.0.0 
#
return
```
[R1-ospf-1]q  
[R1]int g0/0/0  
[R1-GigabitEthernet0/0/0]ospf enable area 0  
```
[R1-Serial2/0/0]
Apr 11 2021 08:54:29-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[5]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=HelloReceived, NeighborPreviousState=Down, NeighborCurrentState=Init) 
[R1-Serial2/0/0]
Apr 11 2021 08:54:34-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[6]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=2WayReceived, NeighborPreviousState=Init, NeighborCurrentState=ExStart) 
[R1-Serial2/0/0]
Apr 11 2021 08:54:34-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[7]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=NegotiationDone, NeighborPreviousState=ExStart, NeighborCurrentState=Exch
ange) 
[R1-Serial2/0/0]
Apr 11 2021 08:54:34-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[8]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=ExchangeDone, NeighborPreviousState=Exchange, NeighborCurrentState=Loadin
g) 
[R1-Serial2/0/0]
Apr 11 2021 08:54:34-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[9]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=LoadingDone, NeighborPreviousState=Loading, NeighborCurrentState=Full) 
[R1-Serial2/0/0]
Apr 11 2021 08:55:22-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[10]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighb
orEvent=HelloReceived, NeighborPreviousState=Down, NeighborCurrentState=Init) 
[R1-Serial2/0/0]
Apr 11 2021 08:55:27-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[11]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighb
orEvent=2WayReceived, NeighborPreviousState=Init, NeighborCurrentState=ExStart) 

[R1-Serial2/0/0]
Apr 11 2021 08:55:27-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[12]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighb
orEvent=NegotiationDone, NeighborPreviousState=ExStart, NeighborCurrentState=Exc
hange) 
[R1-Serial2/0/0]
Apr 11 2021 08:55:27-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[13]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighb
orEvent=ExchangeDone, NeighborPreviousState=Exchange, NeighborCurrentState=Loadi
ng) 
[R1-Serial2/0/0]
Apr 11 2021 08:55:27-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[14]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighb
orEvent=LoadingDone, NeighborPreviousState=Loading, NeighborCurrentState=Full) 
```
[R1-GigabitEthernet0/0/0]int lo0  
[R1-LoopBack0]ospf enable area 0  //环回接口没有init--Full的过程
[R1-LoopBack0]int s2/0/0  
[R1-Serial2/0/0]ospf enable area 0  
```
[R1-Serial2/0/0]
Apr 11 2021 08:52:03-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[0]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=4.14.0.10, Neighbor
Event=HelloReceived, NeighborPreviousState=Down, NeighborCurrentState=Init) 
[R1-Serial2/0/0]
Apr 11 2021 08:52:03-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[1]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=4.14.0.10, Neighbor
Event=2WayReceived, NeighborPreviousState=Init, NeighborCurrentState=ExStart) 
[R1-Serial2/0/0]
Apr 11 2021 08:52:03-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[2]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=4.14.0.10, Neighbor
Event=NegotiationDone, NeighborPreviousState=ExStart, NeighborCurrentState=Excha
nge) 
[R1-Serial2/0/0]
Apr 11 2021 08:52:03-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[3]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=4.14.0.10, Neighbor
Event=ExchangeDone, NeighborPreviousState=Exchange, NeighborCurrentState=Loading
) 
[R1-Serial2/0/0]
Apr 11 2021 08:52:03-08:00 R1 %%01OSPF/4/NBR_CHANGE_E(l)[4]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=4.14.0.10, Neighbor
Event=LoadingDone, NeighborPreviousState=Loading, NeighborCurrentState=Full) 

``` 
## AR2  
The device is running!  
<R2\>sys  
```
Enter system view, return user view with Ctrl+Z.
```
[R2]ospf  
[R2-ospf-1]area 0  
[R2-ospf-1-area-0.0.0.0]q  
[R2-ospf-1]int lo0  
[R2-LoopBack0]ospf enable area 0  
[R2-LoopBack0]int g0/0/0  
[R2-GigabitEthernet0/0/0]ospf enable area 0  
```
[R2-GigabitEthernet0/0/0]  
Apr 11 2021 08:54:35-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[0]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=HelloReceived, NeighborPreviousState=Down, NeighborCurrentState=Init) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:54:35-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[1]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=2WayReceived, NeighborPreviousState=Init, NeighborCurrentState=2Way) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:54:35-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[2]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=AdjOk?, NeighborPreviousState=2Way, NeighborCurrentState=ExStart) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:54:35-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[3]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=NegotiationDone, NeighborPreviousState=ExStart, NeighborCurrentState=Exch
ange) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:54:35-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[4]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=ExchangeDone, NeighborPreviousState=Exchange, NeighborCurrentState=Loadin
g) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:54:35-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[5]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=LoadingDone, NeighborPreviousState=Loading, NeighborCurrentState=Full) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:55:23-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[6]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighbo
rEvent=HelloReceived, NeighborPreviousState=Down, NeighborCurrentState=Init) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:55:24-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[7]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighbo
rEvent=2WayReceived, NeighborPreviousState=Init, NeighborCurrentState=ExStart) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:55:24-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[8]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighbo
rEvent=NegotiationDone, NeighborPreviousState=ExStart, NeighborCurrentState=Exch
ange) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:55:24-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[9]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighbo
rEvent=ExchangeDone, NeighborPreviousState=Exchange, NeighborCurrentState=Loadin
g) 
[R2-GigabitEthernet0/0/0]
Apr 11 2021 08:55:24-08:00 R2 %%01OSPF/4/NBR_CHANGE_E(l)[10]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=3.123.0.10, Neighb
orEvent=LoadingDone, NeighborPreviousState=Loading, NeighborCurrentState=Full) 
[R2-GigabitEthernet0/0/0]
```
## AR3

The device is running!
<R3\>sys
```
Enter system view, return user view with Ctrl+Z.
```
[R3]ospf
[R3-ospf-1]area 0  
[R3-ospf-1-area-0.0.0.0]int lo0  
[R3-LoopBack0]ospf enable area 0  
[R3-LoopBack0]int g 0/0/0  
[R3-GigabitEthernet0/0/0]ospf enable area 0  
```
[R3-GigabitEthernet0/0/0]  
Apr 11 2021 08:55:23-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[0]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=HelloReceived, NeighborPreviousState=Down, NeighborCurrentState=Init) 
[R3-GigabitEthernet0/0/0]
Apr 11 2021 08:55:23-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[1]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=2WayReceived, NeighborPreviousState=Init, NeighborCurrentState=2Way) 
[R3-GigabitEthernet0/0/0]
Apr 11 2021 08:55:23-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[2]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=AdjOk?, NeighborPreviousState=2Way, NeighborCurrentState=ExStart) 
[R3-GigabitEthernet0/0/0]
Apr 11 2021 08:55:23-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[3]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=NegotiationDone, NeighborPreviousState=ExStart, NeighborCurrentState=Exch
ange) 
[R3-GigabitEthernet0/0/0]
Apr 11 2021 08:55:23-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[4]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=ExchangeDone, NeighborPreviousState=Exchange, NeighborCurrentState=Loadin
g) 
[R3-GigabitEthernet0/0/0]
Apr 11 2021 08:55:23-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[5]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=2.123.0.10, Neighbo
rEvent=LoadingDone, NeighborPreviousState=Loading, NeighborCurrentState=Full) 
[R3-GigabitEthernet0/0/0]ping 
Apr 11 2021 08:55:27-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[6]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=HelloReceived, NeighborPreviousState=Down, NeighborCurrentState=Init) 
[R3-GigabitEthernet0/0/0]ping 
Apr 11 2021 08:55:27-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[7]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=2WayReceived, NeighborPreviousState=Init, NeighborCurrentState=2Way) 
[R3-GigabitEthernet0/0/0]ping 
Apr 11 2021 08:55:27-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[8]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=AdjOk?, NeighborPreviousState=2Way, NeighborCurrentState=ExStart) 
[R3-GigabitEthernet0/0/0]ping 
Apr 11 2021 08:55:27-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[9]:Neighbor changes eve
nt: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighbo
rEvent=NegotiationDone, NeighborPreviousState=ExStart, NeighborCurrentState=Exch
ange) 
[R3-GigabitEthernet0/0/0]ping 
Apr 11 2021 08:55:27-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[10]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighb
orEvent=ExchangeDone, NeighborPreviousState=Exchange, NeighborCurrentState=Loadi
ng) 
[R3-GigabitEthernet0/0/0]ping 
Apr 11 2021 08:55:27-08:00 R3 %%01OSPF/4/NBR_CHANGE_E(l)[11]:Neighbor changes ev
ent: neighbor status changed. (ProcessId=256, NeighborAddress=1.123.0.10, Neighb
orEvent=LoadingDone, NeighborPreviousState=Loading, NeighborCurrentState=Full) 
```
[R3-GigabitEthernet0/0/0]ping 10.1.0.1
```
  PING 10.1.0.1: 56  data bytes, press CTRL_C to break
    Reply from 10.1.0.1: bytes=56 Sequence=1 ttl=254 time=50 ms
    Reply from 10.1.0.1: bytes=56 Sequence=2 ttl=254 time=40 ms
    Reply from 10.1.0.1: bytes=56 Sequence=3 ttl=254 time=30 ms
    Reply from 10.1.0.1: bytes=56 Sequence=4 ttl=254 time=30 ms
    Reply from 10.1.0.1: bytes=56 Sequence=5 ttl=254 time=20 ms

  --- 10.1.0.1 ping statistics ---
    5 packet(s) transmitted
    5 packet(s) received
    0.00% packet loss
    round-trip min/avg/max = 20/34/50 ms
```
[R3-GigabitEthernet0/0/0]ping 10.1.1.1  
```
  PING 10.1.1.1: 56  data bytes, press CTRL_C to break
    Request time out
    Request time out
    Request time out
    Request time out
    Request time out

  --- 10.1.1.1 ping statistics ---
    5 packet(s) transmitted
    0 packet(s) received
    100.00% packet loss
```
[R3-GigabitEthernet0/0/0]ping 10.1.1.1
```
  PING 10.1.1.1: 56  data bytes, press CTRL_C to break
    Reply from 10.1.1.1: bytes=56 Sequence=1 ttl=254 time=30 ms
    Reply from 10.1.1.1: bytes=56 Sequence=2 ttl=254 time=30 ms
    Reply from 10.1.1.1: bytes=56 Sequence=3 ttl=254 time=30 ms
    Reply from 10.1.1.1: bytes=56 Sequence=4 ttl=254 time=20 ms
    Reply from 10.1.1.1: bytes=56 Sequence=5 ttl=254 time=20 ms

  --- 10.1.1.1 ping statistics ---
    5 packet(s) transmitted
    5 packet(s) received
    0.00% packet loss
    round-trip min/avg/max = 20/26/30 ms
```
## AR4
The device is running!  
<R4\>sys  
```
Enter system view, return user view with Ctrl+Z.
```
[R4]ospf  
[R4-ospf-1]area 0  
[R4-ospf-1-area-0.0.0.0]dis th  
```
[V200R003C00]
#
 area 0.0.0.0 
#
return
```
[R4-ospf-1-area-0.0.0.0]q  
[R4-ospf-1]dis th  
```
[V200R003C00]
#
ospf 1 
 area 0.0.0.0 
#
return
```
[R4]int lo0  
[R4-LoopBack0]ospf enable 1 area 0  
[R4-LoopBack0]int s2/0/0  
[R4-Serial2/0/0]ospf enable area 0  
[R4-Serial2/0/0]dis th  
```
[V200R003C00]
#
interface Serial2/0/0
 link-protocol ppp
 ip address 10.0.14.4 255.255.255.0 
 rip summary-address 10.1.0.0 255.255.254.0 
 ospf enable 1 area 0.0.0.0
#
return
```

[R4-Serial2/0/0]q  
[R4]dis ip routing-table 
```
Route Flags: R - relay, D - download to fib
------------------------------------------------------------------------------
Routing Tables: Public
         Destinations : 18       Routes : 18       

Destination/Mask    Proto   Pre  Cost      Flags NextHop         Interface

       10.0.1.0/24  RIP     100  1           D   10.0.14.1       Serial2/0/0
       10.0.2.0/24  RIP     100  2           D   10.0.14.1       Serial2/0/0
       10.0.3.0/24  RIP     100  2           D   10.0.14.1       Serial2/0/0
      10.0.14.0/24  Direct  0    0           D   10.0.14.4       Serial2/0/0
      10.0.14.1/32  Direct  0    0           D   10.0.14.1       Serial2/0/0
      10.0.14.4/32  Direct  0    0           D   127.0.0.1       Serial2/0/0
    10.0.14.255/32  Direct  0    0           D   127.0.0.1       Serial2/0/0
     10.0.123.0/24  RIP     100  1           D   10.0.14.1       Serial2/0/0
       10.1.0.0/24  Direct  0    0           D   10.1.0.1        LoopBack0
       10.1.0.1/32  Direct  0    0           D   127.0.0.1       LoopBack0
     10.1.0.255/32  Direct  0    0           D   127.0.0.1       LoopBack0
       10.1.1.0/24  Direct  0    0           D   10.1.1.1        LoopBack1
       10.1.1.1/32  Direct  0    0           D   127.0.0.1       LoopBack1
     10.1.1.255/32  Direct  0    0           D   127.0.0.1       LoopBack1
      127.0.0.0/8   Direct  0    0           D   127.0.0.1       InLoopBack0
      127.0.0.1/32  Direct  0    0           D   127.0.0.1       InLoopBack0
127.255.255.255/32  Direct  0    0           D   127.0.0.1       InLoopBack0
255.255.255.255/32  Direct  0    0           D   127.0.0.1       InLoopBack0
```

[R4-LoopBack1]ospf enable area 0

[R1]dis ospf brief
```
	 OSPF Process 1 with Router ID 10.0.123.1
		 OSPF Protocol Information

 RouterID: 10.0.123.1       Border Router: 
 Multi-VPN-Instance is not enabled
 Global DS-TE Mode: Non-Standard IETF Mode
 Graceful-restart capability: disabled
 Helper support capability  : not configured
 Applications Supported: MPLS Traffic-Engineering 
 Spf-schedule-interval: max 10000ms, start 500ms, hold 1000ms
 Default ASE parameters: Metric: 1 Tag: 1 Type: 2
 Route Preference: 10 
 ASE Route Preference: 150 
 SPF Computation Count: 13    
 RFC 1583 Compatible
 Retransmission limitation is disabled
 Area Count: 1   Nssa Area Count: 0 
 ExChange/Loading Neighbors: 0
 Process total up interface count: 2
 Process valid up interface count: 2
 
 Area: 0.0.0.0          (MPLS TE not enabled)
 Authtype: None   Area flag: Normal
 SPF scheduled Count: 13    
 ExChange/Loading Neighbors: 0
 Router ID conflict state: Normal
 Area interface up count: 2

 Interface: 10.0.123.1 (GigabitEthernet0/0/0)
 Cost: 1       State: DR        Type: Broadcast    MTU: 1500  
 Priority: 1
 Designated Router: 10.0.123.1
 Backup Designated Router: 10.0.123.2
 Timers: Hello 10 , Dead 40 , Poll  120 , Retransmit 5 , Transmit Delay 1 

 Interface: 10.0.14.1 (Serial2/0/0) --> 10.0.14.4
 Cost: 48      State: P-2-P     Type: P2P       MTU: 1500  
 Timers: Hello 10 , Dead 40 , Poll  120 , Retransmit 5 , Transmit Delay 1 
```
 [R1]dis ospf peer 
```
	 OSPF Process 1 with Router ID 10.0.123.1
		 Neighbors 

 Area 0.0.0.0 interface 10.0.123.1(GigabitEthernet0/0/0)'s neighbors
 Router ID: 10.0.123.2       Address: 10.0.123.2      
   State: Full  Mode:Nbr is  Master  Priority: 1
   DR: 10.0.123.1  BDR: 10.0.123.2  MTU: 0    
   Dead timer due in 33  sec 
   Retrans timer interval: 5 
   Neighbor is up for 00:08:50     
   Authentication Sequence: [ 0 ] 

 Router ID: 10.0.123.3       Address: 10.0.123.3      
   State: Full  Mode:Nbr is  Master  Priority: 1
   DR: 10.0.123.1  BDR: 10.0.123.2  MTU: 0    
   Dead timer due in 37  sec 
   Retrans timer interval: 5 
   Neighbor is up for 00:07:57     
   Authentication Sequence: [ 0 ] 

		 Neighbors 

 Area 0.0.0.0 interface 10.0.14.1(Serial2/0/0)'s neighbors
 Router ID: 10.1.0.1         Address: 10.0.14.4       
   State: Full  Mode:Nbr is  Master  Priority: 1
   DR: None   BDR: None   MTU: 0    
   Dead timer due in 35  sec 
   Retrans timer interval: 5 
   Neighbor is up for 00:11:21     
   Authentication Sequence: [ 0 ] 
```
   
[R1]dis ospf peer brief
```
	 OSPF Process 1 with Router ID 10.0.123.1
		  Peer Statistic Information
 ----------------------------------------------------------------------------
 Area Id          Interface                        Neighbor id      State    
 0.0.0.0          GigabitEthernet0/0/0             10.0.123.2       Full        
 0.0.0.0          GigabitEthernet0/0/0             10.0.123.3       Full        
 0.0.0.0          Serial2/0/0                      10.1.0.1         Full        
 ----------------------------------------------------------------------------
```

 [R1]dis ospf int  //?????��??????ospf
```
	 OSPF Process 1 with Router ID 10.0.123.1
		 Interfaces 

 Area: 0.0.0.0          (MPLS TE not enabled)
 IP Address      Type         State    Cost    Pri   DR              BDR 
 10.0.123.1      Broadcast    DR       1       1     10.0.123.1      10.0.123.2
 10.0.14.1       P2P          P-2-P    48      1     0.0.0.0         0.0.0.0
```

 [R1]dis ip routing-table protocol ospf
```
Route Flags: R - relay, D - download to fib
------------------------------------------------------------------------------
Public routing table : OSPF
         Destinations : 4        Routes : 4        

OSPF routing table status : <Active>
         Destinations : 4        Routes : 4

Destination/Mask    Proto   Pre  Cost      Flags NextHop         Interface

       10.0.2.2/32  OSPF    10   1           D   10.0.123.2      GigabitEthernet
0/0/0
       10.0.3.3/32  OSPF    10   1           D   10.0.123.3      GigabitEthernet
0/0/0
       10.1.0.1/32  OSPF    10   48          D   10.0.14.4       Serial2/0/0
       10.1.1.1/32  OSPF    10   48          D   10.0.14.4       Serial2/0/0

OSPF routing table status : <Inactive>
         Destinations : 0        Routes : 0
```
[R1]dis ospf lsdb
```
	 OSPF Process 1 with Router ID 10.0.123.1
		 Link State Database 

		         Area: 0.0.0.0
 Type      LinkState ID    AdvRouter          Age  Len   Sequence   Metric
 Router    10.1.0.1        10.1.0.1           636  72    80000004       0
 Router    10.0.123.3      10.0.123.3         671  48    80000006       1
 Router    10.0.123.2      10.0.123.2         675  48    80000006       1
 Router    10.0.123.1      10.0.123.1         562  60    8000000B       1
 Network   10.0.123.1      10.0.123.1         670  36    80000004       0
```
 [R1]dis ospf routing 
```
	 OSPF Process 1 with Router ID 10.0.123.1
		  Routing Tables 

 Routing for Network 
 Destination        Cost  Type       NextHop         AdvRouter       Area
 10.0.14.0/24       48    Stub       10.0.14.1       10.0.123.1      0.0.0.0
 10.0.123.0/24      1     Transit    10.0.123.1      10.0.123.1      0.0.0.0
 10.0.2.2/32        1     Stub       10.0.123.2      10.0.123.2      0.0.0.0
 10.0.3.3/32        1     Stub       10.0.123.3      10.0.123.3      0.0.0.0
 10.1.0.1/32        48    Stub       10.0.14.4       10.1.0.1        0.0.0.0
 10.1.1.1/32        48    Stub       10.0.14.4       10.1.0.1        0.0.0.0

 Total Nets: 6  
 Intra Area: 6  Inter Area: 0  ASE: 0  NSSA: 0 
```
 [R1]dis ospf int g0/0/0 //???????
```
	 OSPF Process 1 with Router ID 10.0.123.1
		 Interfaces 


 Interface: 10.0.123.1 (GigabitEthernet0/0/0)
 Cost: 1       State: DR        Type: Broadcast    MTU: 1500  
 Priority: 1
 Designated Router: 10.0.123.1
 Backup Designated Router: 10.0.123.2
 Timers: Hello 10 , Dead 40 , Poll  120 , Retransmit 5 , Transmit Delay 1 
```
 ?????????????  

[R1]int g0/0/0
[R1-GigabitEthernet0/0/0]ospf dr-priority ?
```
  INTEGER<0-255>  Router priority value
```

[R1-GigabitEthernet0/0/0]ospf dr-priority 2  
[R1-GigabitEthernet0/0/0]dis ospf int g 0/0/0  
```
	 OSPF Process 1 with Router ID 10.0.123.1
		 Interfaces 
 Interface: 10.0.123.1 (GigabitEthernet0/0/0)
 Cost: 1       State: DR        Type: Broadcast    MTU: 1500  
 Priority: 2
 Designated Router: 10.0.123.1
 Backup Designated Router: 10.0.123.2
 Timers: Hello 10 , Dead 40 , Poll  120 , Retransmit 5 , Transmit Delay 1 
```
