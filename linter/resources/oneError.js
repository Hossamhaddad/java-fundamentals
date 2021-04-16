
function zadd1(a,b,z) {
    var ones, zf;
    zf = or(or(and(a,b), and(b,z)), and(a,z));
    j = or(a, nor(b,z));
    k = or(b, nor(a,z))