{\rtf1\ansi\ansicpg1252\cocoartf2759
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class CalculadoraEntrades \{\
    public double calcularPreu(String categoria, boolean esFestiu, boolean teTarjetaFidelitat) \{\
        double preu = 0;\
        if (categoria.equals("adult"))   preu = 9.50;\
        if (categoria.equals("jove"))    preu = 7.00;\
        if (categoria.equals("jubilat")) preu = 6.50;\
        if (categoria.equals("infant"))  preu = 5.00;\
        if (esFestiu)              preu = preu + 1.50;\
        if (teTarjetaFidelitat)    preu = preu * 0.90;\
        return preu;\
    \}\
\}}