{\rtf1\ansi\ansicpg1252\cocoartf2759
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class GestorPromocions \{\
    public double aplicarPromocio(Entrada entrada, String codiPromocio) \{\
        double preu = entrada.getPreuBase();\
        if (codiPromocio.equals("ESTUDIANT")) \{\
            ValidadorEstudiant val = new ValidadorEstudiant(\
                "https://api.carnet.edu", "TOKEN-123");\
            if (val.verificar(entrada.getClientId())) preu = preu * 0.75;\
        \} else if (codiPromocio.equals("SOCI")) \{\
            ClubSocisServei socis = new ClubSocisServei(\
                "jdbc:mysql://localhost/socis", "root", "1234");\
            if (socis.esSoci(entrada.getClientId())) preu = preu * 0.80;\
        \} else if (codiPromocio.equals("ANIVERSARI")) \{\
            preu = preu * 0.50;\
        \}\
        return preu;\
    \}\
\}}